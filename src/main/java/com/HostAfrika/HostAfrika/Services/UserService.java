package com.HostAfrika.HostAfrika.Services;

import com.HostAfrika.HostAfrika.Domain.Users.Users;
import com.HostAfrika.HostAfrika.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public boolean findEmail(String email){
        Optional<Users> user = repository.findByEmail(email);
        return user.isPresent();
    }

    public ResponseEntity<String> validateUserEmail(String email){
        if(findEmail(email)){
            return ResponseEntity.badRequest().body("Email already exists!");
        }else {
            return ResponseEntity.ok().body("Email available!");
        }
    }
}
