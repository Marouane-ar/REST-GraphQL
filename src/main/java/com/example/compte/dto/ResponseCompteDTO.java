package com.example.compte.dto;

import com.example.compte.Enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ResponseComptedto {

    private String id;
    private Date creation_compte;
    private Double solde_compte;
    private String devise_compte;
    private TypeCompte typeCompte;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreation_compte() {
		return creation_compte;
	}
	public void setCreation_compte(Date creation_compte) {
		this.creation_compte = creation_compte;
	}
	public Double getsolde_compte() {
		return solde_compte;
	}
	public void setsolde_compte(Double solde_compte) {
		this.solde_compte = solde_compte;
	}
	public String getDevise_compte() {
		return devise_compte;
	}
	public void setDevise_compte(String devise_compte) {
		this.devise_compte = devise_compte;
	}
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
    
    
}
