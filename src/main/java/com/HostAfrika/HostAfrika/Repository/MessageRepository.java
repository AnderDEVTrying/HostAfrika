package com.HostAfrika.HostAfrika.Repository;

import com.HostAfrika.HostAfrika.Domain.Messages.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MessageRepository extends JpaRepository<Messages, UUID> {
}
