package edu.ijse.security.service;

import edu.ijse.security.dto.AuthDTO;
import edu.ijse.security.dto.AuthResponseDTO;
import edu.ijse.security.dto.RegisterDTO;
import edu.ijse.security.entity.Role;
import edu.ijse.security.entity.User;
import edu.ijse.security.repo.UserRepo;
import edu.ijse.security.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthResponseDTO authenticate(AuthDTO authDTO){
        //find user from db
        User user=userRepo.findByUsername(authDTO.getUsername()).orElseThrow(()->new UsernameNotFoundException(authDTO.getUsername()));
        //match passwords
        if(!passwordEncoder.matches(authDTO.getPassword(),user.getPassword())){
            throw new BadCredentialsException(authDTO.getUsername());
        }
        //new token generation
        String token=jwtUtil.generateToken(authDTO.getUsername());
        return new AuthResponseDTO(token);
    }

    public String register(RegisterDTO registerDTO){
        if(userRepo.findByUsername(registerDTO.getUsername()).isPresent()){
            throw new RuntimeException("username is already in use");
        }
       User user=User.builder().username(registerDTO.getUsername()).password(passwordEncoder.encode(registerDTO.getPassword())).role(Role.valueOf(registerDTO.getRole())).build();
        userRepo.save(user);
        return "user registration successful";
    }
}
