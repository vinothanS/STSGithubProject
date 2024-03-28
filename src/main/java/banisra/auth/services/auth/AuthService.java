package banisra.auth.services.auth;

import banisra.auth.dtos.SignupRequest;
import banisra.auth.dtos.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
}
