package com.HostAfrika.HostAfrika.Domain.Messages;

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
@Table(name = "messages")
public class Messages {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Users sender;
    private String content;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Users receiver;

    private Timestamp sentAt;

}
