package com.example.encapsulation.services;

import com.example.encapsulation.domain.Commande;
import com.example.encapsulation.domain.Item;
import com.example.encapsulation.enumerations.StatutCommande;

import java.util.ArrayList;
import java.util.List;

public class CommandeService {

    public Commande ajouterItemAuPanier(Commande commande, Item itemAjoute) {
        List<Item> itemsCommande = new ArrayList<>(commande.getItems());
        itemsCommande.add(itemAjoute);

        return new Commande(itemsCommande, StatutCommande.TERMINE, Commande.getPrixTotal(itemsCommande));
    }

    public Commande initialiserCommande() {
        List<Item> articles = new ArrayList<>();
        Item article1 = new Item(0, "Mon article initial 1", 10);
        Item article2 = new Item(1, "Mon article initial 2", 20);
        articles.add(article1);
        articles.add(article2);

        Integer prixTotal = Commande.getPrixTotal(articles);

        return new Commande(articles, StatutCommande.EN_COURS, prixTotal);
    }

    public Item initialiserArticle() {
        return new Item(2, "Mon article ajoute", 30);
    }
}
