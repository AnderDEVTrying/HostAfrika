package DTO.UsersDTO;

import java.util.Date;

public record UsersRequestDTO(String firstName, String lastName, String email, String password,
                              String phoneNumber, Date birthDate) {
}
