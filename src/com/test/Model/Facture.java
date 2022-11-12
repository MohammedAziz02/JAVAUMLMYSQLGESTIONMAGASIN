package com.test.Model;

import java.util.ArrayList;
import java.util.Date;

public class Facture {
    private String numero;
    private Date date;
    private int total;
    Client client;
    ArrayList<Produit> produits;
    ArrayList<LigneCommande> ligneCommandes;
    public Facture(String numero, Date date, Client client) {
        this.numero = numero;
        this.date = date;
        this.client = client;
        this.produits=new ArrayList<Produit>();
        this.ligneCommandes=new ArrayList<LigneCommande>();
    }
    public void addligneCommande(LigneCommande l){
        this.ligneCommandes.add(l);
        System.out.println("listecommande bien ajouté");
    }

    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public ArrayList<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(ArrayList<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public void addProduit(Produit p){
        this.produits.add(p);
        System.out.println("produit added with success");
    }
    public void deleteProduit(Produit p){
        boolean remove = this.produits.remove(p);
        if(remove) {
            System.out.println("produit deleted with success");
        }
    }

 @Override
    public String toString() {
        return "Facture{" +
                "numero='" + numero + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", client=" + client +
                ", Produit= "+produits+
                '}';
    }
}
