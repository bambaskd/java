package sn.isi.dao;

import sn.isi.entities.Etudiant;

import java.util.Scanner;

public class EtudiantDB {

    private Scanner scan = new Scanner(System.in);
    public void affichage()
    {
        Etudiant et= new Etudiant();
        DB d=new DB();


        Etudiant e=new Etudiant();
       /* e.saissi();*/
        System.out.println("DONNER LE NOM");
        e.setNom(scan.nextLine());
        System.out.println("DONNER LE PRENOM");
        e.setPrenom(scan.nextLine());
        System.out.println("DONNER LA MAT");
        e.setMat(scan.nextLine());
        System.out.println("le matricule: " + e.getMat());
        System.out.println("le nom: " + e.getNom());
        System.out.println("le prenom: " + e.getPrenom());
        System.out.println("Etudiant créé ");
        d.message();
    }
}
