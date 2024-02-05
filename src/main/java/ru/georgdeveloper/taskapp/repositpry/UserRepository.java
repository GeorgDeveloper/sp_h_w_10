package ru.georgdeveloper.taskapp.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.georgdeveloper.taskapp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
