package sn.isi.traitement;

import sn.isi.entities.Client;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientImp implements IClient {
    DB db = new DB();
    Scanner scan = new Scanner(System.in);
    Client c=new Client();



    @Override
    public int add(Client c) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner le nom duclient");
        c.setNom(sc.nextLine());
        System.out.println("donner le prenom du client");
        c.setPrenom(sc.nextLine());
        System.out.println("donner le email du client");
        c.setEmail(sc.nextLine());
        System.out.println("donner le password du client");
        c.setPassword(sc.nextLine());
        System.out.println("donner le tel du client");
        c.setPassword(sc.nextLine());
        db.getConnection();
        String sql = "INSERT INTO client VALUES(NULL,?,?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1, c.getNom());
        db.getPstm().setString(2, c.getPrenom());
        db.getPstm().setString(3, c.getEmail());
        db.getPstm().setString(4, c.getTel());
        db.getPstm().setString(5, c.getPassword());

        int ok = db.executeUpdate();
        return ok;


    }

    @Override
    public int update(String email ) throws Exception {




                Client c= new Client();
                System.out.println("donner le nom");
                c.setNom(scan.nextLine());
                System.out.println("donner le prenom");
                c.setPrenom(scan.nextLine());
                System.out.println("donner le password");
                c.setPassword(scan.nextLine());
                System.out.println("donner le telephone");
                c.setTel(scan.nextLine());
                db.getConnection();
                String sql = "UPDATE client SET  nom= ?,prenom= ?,tel= ? , password=? WHERE email=? ";
                db.init(sql);
                db.getPstm().setString(1, c.getNom());
                db.getPstm().setString(2, c.getPrenom());
                db.getPstm().setString(3, c.getTel());
                db.getPstm().setString(4, c.getPassword());
                db.getPstm().setString(5, c.getEmail());
                int ok = db.executeUpdate();

        return ok;
    }

    @Override
    public Client get(String email) throws Exception {
        IClient ic = new ClientImp();
        c = null;
        db.getConnection();
        String sql = "SELECT * FROM client";
        db.init(sql);
        db.getPstm().setString(4, email);
        ResultSet rs = db.executeSelect();
        if (rs.next()) {
            c = new Client();
            c.setNom(rs.getString(2));
            c.setPrenom(rs.getString(3));
            c.setEmail(rs.getString(4));
            c.setTel(rs.getString(5));

        }

        return c;
    }

    @Override
    public List<Client> list() throws Exception {
        List<Client> c = new ArrayList<>();
        db.getConnection();
        String sql = "SELECT * FROM client ";
        db.init(sql);
        ResultSet rs = db.executeSelect();
        while (rs.next()) {
            Client cl = new Client();
            cl.setNom(rs.getString(2));
            cl.setPrenom(rs.getString(3));
            cl.setEmail(rs.getString(4));
            cl.setTel(rs.getString(5));
            cl.setEmail(rs.getString(4));
            c.add(cl);
        }
        return c;
    }

    @Override
    public String searchClient(String email) throws Exception {
        System.out.print("donner l'email du client");
        c.setEmail(scan.nextLine());
        IClient ic = new ClientImp();
        List<Client> listC =ic.list();
        for (Client c : listC){
            if (c.getEmail().equals(c.getEmail())){
                System.out.println(" nom : "+c.getNom());
                System.out.println(" prenom : "+c.getPrenom());
                System.out.println(" email : "+c.getEmail());
            }
        }
        return email;
    }
}
