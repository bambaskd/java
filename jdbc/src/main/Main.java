package main;

import sn.isi.dao.DB;
import sn.isi.dao.IProduit;
import sn.isi.dao.ProduitImp;
import sn.isi.entities.Produit;

public class Main {
    public static void main(String[] args) throws Exception{
        Produit p = new Produit();
        p.setId(1);
        p.setNom("DIOP");
        p.setRef("123");
        IProduit ip= new ProduitImp();
        ip.add(p);
    }
}
