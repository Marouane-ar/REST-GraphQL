package com.example.compte.Service;

import com.example.compte.dto.RequestComptedto;
import com.example.compte.dto.ResponseComptedto;
import com.example.compte.Entity.Compte;
import com.example.compte.mapers.Comptemaper;
import com.example.compte.Repository.CompteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CompteServiceImpl implements CompteService{

    private CompteRepository compteRepository;
    private Comptemaper comptemaper;

    public CompteServiceImpl(CompteRepository compteRepository, Comptemaper comptemaper) {
        this.compteRepository = compteRepository;
        this.comptemaper = comptemaper;
    }

    @Override
    public ResponseComptedto save(RequestComptedto requestComptedto) {
        Compte compte = comptemaper.deRequestCompteACompte(requestComptedto);
        compte.setId(UUID.randomUUID().toString());
        compte.setCreation_compte(new Date());

        Compte compte_saved = compteRepository.save(compte);


        return comptemaper.deCompteAResponseCompte(compte_saved);
    }

    @Override
    public ResponseComptedto update(String id, Compte compte) {

        Compte compte_updated = compteRepository.findById(id).orElseThrow();

        if(compte.getDevise_compte() != null) compte_updated.setDevise_compte(compte.getDevise_compte());
        if(compte.getsolde_compte() != null) compte_updated.setsolde_compte(compte.getsolde_compte());
        if(compte.getTypeCompte() != null) compte_updated.setTypeCompte(compte.getTypeCompte());

        Compte new_compte = compteRepository.save(compte_updated);

        return comptemaper.deCompteAResponseCompte(new_compte);
    }
    @Override
    public void delete(String id) {
        compteRepository.deleteById(id);
    }

    @Override
    public ResponseComptedto findById(String id) {

        Compte compte = compteRepository.findById(id).get();
        return comptemaper.deCompteAResponseCompte(compte);
    }

    @Override
    public List<ResponseComptedto> findAll() {

        List<Compte> comptes = compteRepository.findAll();
        List<ResponseComptedto> responseComptedtoS = new ArrayList<>();

        for (Compte index : comptes){
            responseComptedtoS.add(comptemaper.deCompteAResponseCompte(index));
        }

        return responseComptedtoS;
    }
}
