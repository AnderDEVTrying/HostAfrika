package com.HostAfrika.HostAfrika.Domain.Users;

import DTO.UsersDTO.UsersRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {
    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;

    private String email;
    private String password;

    private String phoneNumber;
    private Date birthDate;

    private Timestamp createStamp;

    public Users (UsersRequestDTO data){
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.email = data.email();
        this.password = data.password();
        this.phoneNumber = data.phoneNumber();
        this.birthDate = data.birthDate();
        this.createStamp= new Timestamp(System.currentTimeMillis());
    }
}
