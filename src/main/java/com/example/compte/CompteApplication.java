package com.example.compte;

import com.example.compte.dto.RequestComptedto;
import com.example.compte.Enums.TypeCompte;
import com.example.compte.Service.CompteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CompteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteService compteService){
        return args -> {
          for (int i=0 ; i<3 ; i++){
              compteService.save(new RequestComptedto(Math.random()*1000,"DHS", TypeCompte.COURANT));
          }
            for (int i=0 ; i<3 ; i++){
                compteService.save(new RequestComptedto(Math.random()*1000,"DHS", TypeCompte.EPARGNE));
            }
        };
    }
}
