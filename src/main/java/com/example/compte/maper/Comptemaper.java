package com.example.compte.mapers;

import com.example.compte.dto.RequestComptedto;
import com.example.compte.dto.ResponseComptedto;
import com.example.compte.Entity.Compte;

public interface Comptemaper{

    Compte deRequestCompteACompte(RequestComptedto requestComptedto);
    ResponseComptedto deCompteAResponseCompte(Compte compte);
}
