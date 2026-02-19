package edu.ijse.security.service;

import edu.ijse.security.dto.AuthDTO;
import edu.ijse.security.dto.AuthResponseDTO;
import edu.ijse.security.entity.User;
import edu.ijse.security.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepo userRepo;

    public AuthResponseDTO authenticate(AuthDTO authDTO){
        User user=userRepo.findByUsername(authDTO.getUsername()).orElseThrow(()->new UsernameNotFoundException(authDTO.getUsername()));
    }
}
