package main;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;
import sn.isi.traitement.IRn;
import sn.isi.traitement.IZone;
import sn.isi.traitement.RnImp;
import sn.isi.traitement.ZoneImp;

public class Main {
    public static void main(String[] args) {


    IRn irn= new RnImp();
    Rn rn= irn.saisi();
     irn.affichage(rn);


    }
}
