package com.example.apimanagement.service;


import com.example.apimanagement.model.Tasa;
import com.example.apimanagement.repository.RepositoryTasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTasaImpl implements ServiceTasa {

    private final RepositoryTasa repositoryTasa;

    @Autowired
    public ServiceTasaImpl(RepositoryTasa repositoryAlumno) {
        this.repositoryTasa = repositoryAlumno;
    }

    @Override
    public Tasa insertTasa(Tasa tasa) {
        return repositoryTasa.save(tasa);
    }

    @Override
    public void deleteTasa(Long id) {
        repositoryTasa.deleteById(id);
    }

    @Override
    public List<Tasa> getAllTasas() {
        return repositoryTasa.findAll();
    }

    @Override
    public Tasa updateTasa(Tasa tasa) {
        return repositoryTasa.save(tasa);
    }

    @Override
    public Optional<Tasa> getTasa(Long id) {
        return repositoryTasa.findById(id);
    }


}
