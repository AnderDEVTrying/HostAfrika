package com.HostAfrika.HostAfrika.Domain.Reservations;

import com.HostAfrika.HostAfrika.Domain.Listings.Listings;
import com.HostAfrika.HostAfrika.Domain.Users.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listings listings;

    private Date fromDate;
    private Date toDate;

    private float totalPrice;
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
