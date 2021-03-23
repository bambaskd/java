package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProduitImp implements IProduit{
    private DB db=new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(Produit p) {
        String sql="INSERT INTO produit VALUES(?,?,?)";
        try {
            db.getConnection();
            db.init(sql);
            db.getPstm().setString(1, p.getRef());
            db.getPstm().setString(2, p.getNom());
            db.getPstm().setInt(3, p.getUser().getId());
            ok= db.executeUpdate();
            db.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }

        return ok;
    }

    @Override


    public List<Produit> listeP() {
        List<Produit> p=new ArrayList<Produit>();
        String sql="SELECT* FROM produit";
        try {
            db.init(sql);
            rs= db.executeSelect();
            while (rs.next()){
                Produit a= new Produit();
                a.setRef(rs.getString(1));
                a.setNom(rs.getString(2));
                a.setId(rs.getInt(3));

                listeP().add(a);
            }
            db.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return p;
    }
    public int delete(int id) throws Exception {
        db.getConnection();
        String sql ="DELETE FROM produit WHERE id=?";
        db.init(sql);
        db.getPstm().setInt(1,id);

        int ok = db.executeUpdate();
        return ok;
    }
    @Override
    public int update(Produit p) {
        try {
            String sql="UPDATE produit SET ref=?, nom=?, user=?)";
            db.init(sql);
            db.getPstm().setString(1, p.getRef());
            db.getPstm().setString(2, p.getNom());
            db.getPstm().setInt(3, p.getId());
            listeP().add(p);
            ok= db.executeUpdate();
            db.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }
    public Produit get(int id) throws Exception {
        Produit produit = null;
        this.db.getConnection();
        String sql = "SELECT * FROM produit WHERE nom LIKE ? ";
        this.db.init(sql);
        this.db.getPstm().setInt(1, id);
        ResultSet rs = this.db.executeSelect();
        if (rs.next()) {
            produit = new Produit();
            produit.setId(rs.getInt(1));
            produit.setRef(rs.getString(2));
            produit.setNom(rs.getString(3));
        }

        return produit;
    }
}
