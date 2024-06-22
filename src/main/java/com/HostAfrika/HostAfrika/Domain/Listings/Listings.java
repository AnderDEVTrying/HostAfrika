package com.HostAfrika.HostAfrika.Domain.Listings;

import com.HostAfrika.HostAfrika.Domain.Users.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "listings")
public class Listings {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    private String title;
    private String description;
    private String country;
    private String region;
    private String address;
    private float price;
    private Timestamp createstamp;
}
