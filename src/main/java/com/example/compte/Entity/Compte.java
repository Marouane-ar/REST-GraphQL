package com.example.compte.Entity;

import com.example.compte.Enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Compte {
    @Id
    private String id;
    @Enumerated(EnumType.STRING)
    private TypeCompte typeCompte;

	public void setCreation_compte(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}

	public Object getDevise_compte() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getsolde_compte() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTypeCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDevise_compte(Object devise_compte2) {
		// TODO Auto-generated method stub
		
	}

	public void setTypeCompte(Object typeCompte2) {
		// TODO Auto-generated method stub
		
	}

	public void setsolde_compte(Object solde_compte2) {
		// TODO Auto-generated method stub
		
	}
}
