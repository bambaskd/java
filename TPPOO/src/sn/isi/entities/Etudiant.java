package sn.isi.entities;

import java.util.Scanner;
public class Etudiant {
   private String mat;
   private String nom;
   private String prenom;
   private Scanner scan = new Scanner(System.in);

    public void saissi(){
        System.out.println("DONNER LE NOM");
        nom=scan.nextLine();
        System.out.println("DONNER LE PRENOM");
        prenom=scan.nextLine();
        System.out.println("DONNER LA MAT");
        mat=scan.nextLine();

    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}

