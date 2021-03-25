package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EcoleImp implements IEcole{

    @Override
    public Map<Specialite, Ecole> saisi() {
        Map<Specialite, Ecole> ecole=new HashMap<>();
        Scanner sc= new Scanner(System.in);
        String rep= null;
        do {
            Ecole e=new Ecole();
            Specialite specialite=new Specialite();
            System.out.println("Donner l'id de l'ecole");
            e.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner le nom de l'ecole");
            e.setNom(sc.nextLine());
            System.out.println("Donner la specialite de l'ecole");
            specialite.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner le nom de le specialite");
            specialite.setNom(sc.nextLine());
            System.out.println("Voulez-vous ajouter une nouvelle information? OUI/NON");
            e.setSpecialite(specialite);
            ecole.put(specialite, e);
            rep=sc.nextLine();

        }while (rep.equalsIgnoreCase("oui"));
        return ecole;
    }

    @Override
    public void affichageEcole(Map<Specialite, Ecole> maps) {
        Set<Specialite> specialites = maps.keySet();
        System.out.println("----LISTES DES SPECIALITES");

        for (Specialite sp : specialites) {
            System.out.println("id" + sp.getId() + "nom" +sp.getNom() + "specialite" + sp.getNom());
        }
    }

}
