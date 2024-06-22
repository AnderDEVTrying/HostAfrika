package com.HostAfrika.HostAfrika.Domain.Users;

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
    private String first_name;
    private String last_name;

    private String email;
    private String password;

    private int phone_number;
    private Date birth_date;

    private Timestamp createStamp;
}
