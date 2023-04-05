package com.example.compte.Repository;

import com.example.compte.Entity.Compte;
import com.example.compte.Enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,String> {

    @RestResource(path = "/type")
    List<Compte> findByTypeCompte(@Param("t") TypeCompte typeCompte);
}
