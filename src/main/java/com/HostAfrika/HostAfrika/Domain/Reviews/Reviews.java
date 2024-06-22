package com.HostAfrika.HostAfrika.Domain.Reviews;

import com.HostAfrika.HostAfrika.Domain.Listings.Listings;
import com.HostAfrika.HostAfrika.Domain.Users.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listings listings;
    private int rating;
    private String comment;
    private Timestamp createStamp;
}
