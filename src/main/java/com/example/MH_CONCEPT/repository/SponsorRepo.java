package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.Sponsor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepo extends CrudRepository<Sponsor, String> {

}
