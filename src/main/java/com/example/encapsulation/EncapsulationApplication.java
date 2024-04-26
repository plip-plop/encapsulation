package com.example.encapsulation;

import com.example.encapsulation.services.CommandeService;
import com.example.encapsulation.domain.Commande;
import com.example.encapsulation.domain.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncapsulationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncapsulationApplication.class, args);

        CommandeService commandeService = new CommandeService();
        Commande commande = commandeService.initialiserCommande();
        Item articleAjoute = commandeService.initialiserArticle();

        commandeService.ajouterItemAuPanier(commande, articleAjoute);
    }

}
