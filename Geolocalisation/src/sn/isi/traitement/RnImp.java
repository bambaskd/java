package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImp<T> implements IRn<T>{
    List<Zone> zones= new ArrayList<Zone>();
    public  Rn saisi(){
        String rep;
        Scanner sc= new Scanner(System.in);
        Rn rn = new Rn();
        System.out.println("donner l'identifiant de la RN");
        rn.setId(Integer.parseInt(sc.nextLine()));
        do {
            Zone zn =new Zone();
            System.out.println("donner l'identifiant de la route");
            zn.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner le nom de la zone");
            zn.setNom(sc.nextLine());
            System.out.println("donner la longitude de la zone");
            zn.setLongitude(Double.parseDouble(sc.nextLine()));
            System.out.println("donner la latitude de la zone");
            zn.setLatitude(Double.parseDouble(sc.nextLine()));
            System.out.println("voules vous saisir un nouveau zone O/N");
            zones.add(zn);
            rep= sc.nextLine();
        }while ((rep.equalsIgnoreCase("O")));
        rn.setZones(zones);
        System.out.println("donner la longitude de la RN");
        rn.setLongitude(Double.parseDouble(sc.nextLine()));
        System.out.println("donner la latitude de la RN");
        rn.setLatitude(Double.parseDouble(sc.nextLine()));


        return rn;
    }
    public void affichage(Rn rn){
        zones =rn.getZones();
        System.out.println(" l'identifiant de la RN est" +rn.getId());
        System.out.println("----------Afficher Rn---------------");
        for (Zone zn:zones)
        {
            System.out.println(" l'identifiant de la zone est "+zn.getId());
            System.out.println("le nom de la zone" +zn.getNom());
            System.out.println("la longitude de la zone est "+zn.getLongitude());
            System.out.println("la latitude de la zone est "+zn.getLatitude());
        }
        System.out.println("la longitude de la RN" +rn.getLongitude());
        System.out.println("la latitude de la RN" +rn.getLatitude());
    }

}
