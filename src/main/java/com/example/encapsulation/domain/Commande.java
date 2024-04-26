package com.example.encapsulation.domain;

import com.example.encapsulation.enumerations.StatutCommande;

import java.util.List;


public record Commande(List<Item> items, StatutCommande statutCommande, Integer prixTotal) {
    // Getter sur objet mutable : On retourne une copie immutable de la map.
    public List<Item> getItems() {
        return List.copyOf(items);
    }

    public static Integer getPrixTotal(List<Item> items) {
        return items.stream().map(Item::prix).reduce(0, Integer::sum);
    }
}
