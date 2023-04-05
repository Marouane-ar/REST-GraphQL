package com.example.compte.Web;

import com.example.compte.dto.RequestComptedto;
import com.example.compte.dto.ResponseComptedto;
import com.example.compte.Entity.Compte;
import com.example.compte.mapers.Comptemaper;
import com.example.compte.Service.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
public class CompteController {

    private CompteService compteService;
    private Comptemaper comptemaper;

    public CompteController(CompteService compteService, Comptemaper comptemaper) {
        this.compteService = compteService;
        this.setComptemaper(comptemaper);
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseComptedto save(@RequestBody RequestComptedto compte){
        return compteService.save(compte);
    }


    @PutMapping("/update/{id}")
    @ResponseBody
    public ResponseComptedto update(@PathVariable String id, @RequestBody Compte compte){
        return compteService.update(id,compte);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        compteService.delete(id);
    }

    @GetMapping("/getcompte/{id}")
    @ResponseBody
    public ResponseComptedto getCompte(@PathVariable String id){
        return compteService.findById(id);
    }

    @GetMapping("/comptes")
    @ResponseBody
    public List<ResponseComptedto> comptes(){
        return compteService.findAll();
    }

	public Comptemaper getComptemaper() {
		return comptemaper;
	}

	public void setComptemaper(Comptemaper comptemaper) {
		this.comptemaper = comptemaper;
	}
}
