package com.HostAfrika.HostAfrika.Repository;

import com.HostAfrika.HostAfrika.Domain.Reviews.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Reviews, UUID> {
}
