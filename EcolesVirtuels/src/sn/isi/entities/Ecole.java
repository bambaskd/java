package sn.isi.entities;

public class Ecole {
    private int id;
    private String nom;
    private Specialite specialite;

    public Ecole() {
    }

    public Ecole(int id, String nom, Specialite specialite) {
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
}
