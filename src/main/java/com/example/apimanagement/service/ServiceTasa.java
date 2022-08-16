package com.example.apimanagement.service;

import com.example.apimanagement.model.Tasa;

import java.util.List;
import java.util.Optional;

public interface ServiceTasa {
    Tasa insertTasa(Tasa tasa);
    void deleteTasa(Long id);
    List<Tasa> getAllTasas();
    Tasa updateTasa(Tasa tasa);
    Optional<Tasa> getTasa(Long id);
}
