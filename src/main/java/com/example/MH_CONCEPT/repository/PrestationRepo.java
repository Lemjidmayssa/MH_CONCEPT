package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.Prestation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestationRepo extends CrudRepository<Prestation, String> {
}
