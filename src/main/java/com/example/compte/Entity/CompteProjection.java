package com.example.compte.Entity;

import java.sql.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Compte.class, name = "P1")
public interface CompteProjection {

    public Date getCreation_compte();
    
    public Double getsolde_compte();

}
