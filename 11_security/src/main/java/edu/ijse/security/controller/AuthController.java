package edu.ijse.security.controller;

import edu.ijse.security.dto.AuthDTO;
import edu.ijse.security.dto.RegisterDTO;
import edu.ijse.security.service.AuthService;
import edu.ijse.security.util.APIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@CrossOrigin
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    public ResponseEntity<APIResponse<Object>> registerUSer(@RequestBody RegisterDTO registerDTO){
        return ResponseEntity.ok(new APIResponse<>(
                200,"OK",
                authService.register(registerDTO)
        ));
    }

    public ResponseEntity<APIResponse<Object>> loginUser(@RequestBody AuthDTO authDTO){
        return ResponseEntity.ok(new APIResponse<>(
                200,"OK",
                authService.authenticate(authDTO)
        ));
    }

}
