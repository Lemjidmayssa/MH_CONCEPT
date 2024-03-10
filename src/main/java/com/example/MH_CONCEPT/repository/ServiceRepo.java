package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends CrudRepository<Service, String> {
}
