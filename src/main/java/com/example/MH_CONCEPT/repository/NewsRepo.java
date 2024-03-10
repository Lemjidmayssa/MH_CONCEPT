package com.example.MH_CONCEPT.repository;

import com.example.MH_CONCEPT.entity.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepo extends CrudRepository<News, String> {
}
