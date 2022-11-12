package com.test.Model;

public class LigneCommande {
    private int id;
    private int qte;
    private Double sousTotal;
    private Facture facture;
    private Produit produit;

    public LigneCommande(int id, int qte, Double sousTotal, Facture facture, Produit produit) {
        this.id = id;
        this.qte = qte;
        this.sousTotal = sousTotal;
        this.facture = facture;
        this.produit = produit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Double getSousTotal() {
        return sousTotal;
    }

    public void setSousTotal(Double sousTotal) {
        this.sousTotal = sousTotal;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

   @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", qte=" + qte +
                ", sousTotal=" + sousTotal +
                ", sousTotal=" + produit +

                '}';
    }
}
