package sn.isi.entities;

public class Produit {
    private int id;
    private String ref;
    private String nom;
    private User user;

    public Produit() {
    }

    public Produit(String ref, String nom, User user, int id) {
        this.ref = ref;
        this.nom = nom;
        this.user = user;
        this.id= id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}