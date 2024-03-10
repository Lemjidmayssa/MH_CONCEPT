package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}


