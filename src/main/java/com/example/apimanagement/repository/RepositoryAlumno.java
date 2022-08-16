package com.example.apimanagement.repository;


import com.example.apimanagement.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAlumno extends JpaRepository<Alumno, Long> {
}
