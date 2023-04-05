package com.example.compte.Service;

import com.example.compte.dto.RequestComptedto;
import com.example.compte.dto.ResponseComptedto;
import com.example.compte.Entity.Compte;

import java.util.List;

public interface CompteService{

    ResponseComptedto save(RequestComptedto requestComptedto);
    ResponseComptedto update(String id, Compte compte);
    void delete(String id);
    ResponseComptedto findById(String id);
    List<ResponseComptedto> findAll();
}
