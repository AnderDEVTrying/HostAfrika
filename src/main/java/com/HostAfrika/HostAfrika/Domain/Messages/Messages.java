package com.HostAfrika.HostAfrika.Domain.Messages;

import com.HostAfrika.HostAfrika.Domain.Users.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "messages")
public class Messages {
    private UUID id;
    private Users sender;
    private String content;
    private Users receiver;

    private Timestamp sentAt;

}
