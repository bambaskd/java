package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZoneImp<T> implements IZone<T>{
    Scanner sc= new Scanner(System.in);
    List<Zone> zones= new ArrayList <Zone>();
        Zone zn = new Zone();
    public Zone saisi(){
        System.out.println("donner l'identifiant de la route");
        zn.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Donner le nom de la zone");
            zn.setNom(sc.nextLine());
            System.out.println("donner la longitude de la zone");
            zn.setLongitude(Double.parseDouble(sc.nextLine()));
            System.out.println("donner la latitude de la zone");
            zn.setLatitude(Double.parseDouble(sc.nextLine()));
        return zn;
    }

    @Override
    public void affichage(Zone zn){
        System.out.println(" l'identifiant de la zone est "+zn.getId());
        System.out.println(" le nom de la zone est "+zn.getNom());
        System.out.println("la longitude de la zone est "+zn.getLongitude());
        System.out.println("la latitude de la zone est "+zn.getLatitude());

    }
}
