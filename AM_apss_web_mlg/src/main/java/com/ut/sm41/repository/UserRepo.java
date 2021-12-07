package com.ut.sm41.repository;


import com.ut.sm41.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByName(String username);
}