package com.HostAfrika.HostAfrika.Repository;

import com.HostAfrika.HostAfrika.Domain.Listings.Listings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LisitingRepository extends JpaRepository<Listings, UUID> {
}
