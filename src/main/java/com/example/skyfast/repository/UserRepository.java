package com.example.skyfast.repository;

import com.example.skyfast.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}
