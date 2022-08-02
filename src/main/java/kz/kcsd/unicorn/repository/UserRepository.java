package kz.kcsd.unicorn.repository;

import kz.kcsd.unicorn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
