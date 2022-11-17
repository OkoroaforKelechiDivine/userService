package project.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
