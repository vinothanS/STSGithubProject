package banisra.auth.dtos;

import banisra.auth.enums.UserRole;
import lombok.Data;


@Data
public class AuthenticationResponse {

    private String jwt;
    private UserRole userRole;

    private Long userId;
}
