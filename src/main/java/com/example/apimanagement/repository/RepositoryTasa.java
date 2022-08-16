package com.example.apimanagement.repository;

import com.example.apimanagement.model.Tasa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTasa extends JpaRepository<Tasa, Long> {
}

