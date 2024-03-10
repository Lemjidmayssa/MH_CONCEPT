package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String> {
}


