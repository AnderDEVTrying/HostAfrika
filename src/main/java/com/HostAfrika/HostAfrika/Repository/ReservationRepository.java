package com.HostAfrika.HostAfrika.Repository;

import com.HostAfrika.HostAfrika.Domain.Reservations.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservationRepository  extends JpaRepository<Reservations, UUID> {
}
