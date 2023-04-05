package com.example.compte.dto;

import com.example.compte.Enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
public class RequestComptedto {

    public RequestComptedto(double d, String string, TypeCompte courant) {
		// TODO Auto-generated constructor stub
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
	private Double solde_compte;
    private String devise_compte;
    private TypeCompte typeCompte;
}
