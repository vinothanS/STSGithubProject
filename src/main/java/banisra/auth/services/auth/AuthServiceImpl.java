package banisra.auth.services.auth;


import banisra.auth.dtos.SignupRequest;
import banisra.auth.dtos.UserDto;
import banisra.auth.entity.User;
import banisra.auth.enums.UserRole;
import banisra.auth.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    private final UserRepository userRepository;


    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }


    @Override
    public UserDto createUser(SignupRequest signupRequest) {

         User user = new User();
         user.setName(signupRequest.getName());
         user.setEmail(signupRequest.getEmail());
         user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
         user.setUserRole(UserRole.CUSTOMER);
         userRepository.save(user);
         User createdUser=userRepository.save(user);
         UserDto createdUserDto= new UserDto();
         createdUserDto.setId(createdUser.getId());
         createdUserDto.setName(createdUser.getName());
         createdUserDto.setEmail(createdUser.getEmail());
         createdUserDto.setUserRole(createdUser.getUserRole());


        return createdUserDto;
    }
}
