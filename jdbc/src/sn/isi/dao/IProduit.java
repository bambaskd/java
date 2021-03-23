package sn.isi.dao;

import sn.isi.entities.Produit;

import java.util.List;

public interface IProduit {
    public int add(Produit p);
    public List<Produit> listeP();
    public  int update(Produit p);
    public int delete(int id) throws Exception;
    public Produit get(int id) throws Exception;
}
