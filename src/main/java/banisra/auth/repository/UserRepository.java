package banisra.auth.repository;

import banisra.auth.entity.User;
import banisra.auth.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findFirstByEmail(String email);

    User findByUserRole(UserRole userRole);
}
