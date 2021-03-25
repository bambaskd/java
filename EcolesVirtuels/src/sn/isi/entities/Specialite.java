package sn.isi.entities;

public class Specialite {
    private int id;
    private String nomSp;

    public Specialite() {
    }

    public Specialite(int id, String nom) {
        this.id = id;
        this.nomSp = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nomSp;
    }

    public void setNom(String nom) {
        this.nomSp = nom;
    }
}
