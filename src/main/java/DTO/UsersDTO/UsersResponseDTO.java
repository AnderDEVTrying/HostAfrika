package DTO.UsersDTO;

import com.HostAfrika.HostAfrika.Domain.Users.Users;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public record UsersResponseDTO(UUID id, String firstName, String lastName, String email, String password,
                               String phoneNumber, Date birthDate, Timestamp createStamp) {
    public UsersResponseDTO (Users user){
        this(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),user.getPassword(),user.getPhoneNumber(),
        user.getBirthDate(),user.getCreateStamp());
    }
}
