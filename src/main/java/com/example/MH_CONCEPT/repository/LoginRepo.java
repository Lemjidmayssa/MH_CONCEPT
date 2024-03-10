package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepo extends CrudRepository<login, String> {
}
