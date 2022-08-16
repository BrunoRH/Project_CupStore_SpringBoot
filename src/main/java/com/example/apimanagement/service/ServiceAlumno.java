package com.example.apimanagement.service;

import com.example.apimanagement.model.Alumno;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ServiceAlumno {
    Alumno insertAlumno(Alumno alumno);
    void deleteAlumno(Long id);
    List<Alumno> getAllAlumnos();
    Alumno updateAlumno(Alumno alumno);
    Optional<Alumno> getAlumno(Long id);

}
