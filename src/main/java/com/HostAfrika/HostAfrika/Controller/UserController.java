package com.HostAfrika.HostAfrika.Controller;

import DTO.UsersDTO.UsersRequestDTO;
import DTO.UsersDTO.UsersResponseDTO;
import com.HostAfrika.HostAfrika.Domain.Users.Users;
import com.HostAfrika.HostAfrika.Repository.UserRepository;
import com.HostAfrika.HostAfrika.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hostafrika/user")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserService service;

    @PostMapping ("/signup")
    public ResponseEntity<Map<String, String>> insertUser(@RequestBody UsersRequestDTO data){
        ResponseEntity<String> emailValidationResponse = service.validateUserEmail(data.email());
        if (emailValidationResponse.getStatusCode().is4xxClientError()) {
            return ResponseEntity.status(emailValidationResponse.getStatusCode()).body(Collections.singletonMap("error", emailValidationResponse.getBody()));
        } else {
            Users user = new Users(data);
            repository.save(user);
            return ResponseEntity.ok(Collections.singletonMap("message", "User created successfully"));
        }
    }


    @GetMapping
    public List<UsersResponseDTO> getAllUsers(){
        return repository.findAll().stream().
                map(UsersResponseDTO::new).toList();
    }
}
