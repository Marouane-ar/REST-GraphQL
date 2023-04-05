package com.example.compte.mapers;

import com.example.compte.dto.RequestComptedto;
import com.example.compte.dto.ResponseComptedto;
import com.example.compte.Entity.Compte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ComptemaperImpl implements Comptemaper{
    @Override
    public Compte deRequestCompteACompte(RequestComptedto requestComptedto) {
        Compte compte = new Compte();
        BeanUtils.copyProperties(requestComptedto,compte);
        return compte;
    }

    @Override
    public ResponseComptedto deCompteAResponseCompte(Compte compte) {

        ResponseComptedto responseComptedto = new ResponseComptedto();
        BeanUtils.copyProperties(compte,responseComptedto);
        return responseComptedto;
    }
}
