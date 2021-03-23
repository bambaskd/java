package sn.isi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    // pour connexion
    private Connection cnx;
    // pour les resultats des requet de type select
    private ResultSet rs;
    // pour les requetes preparees
    private PreparedStatement  pstm;
    // requetes pour les mises a jour
    private  int ok;

    public void  getConnection(){
        String url="jdbc:mysql://localhost:3306/gestionProduit";
        String user="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx= DriverManager.getConnection(url, user, password);
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
    public void  init (String sql) throws Exception{
            pstm = cnx.prepareStatement(sql);
    }

    public  int executeUpdate() throws Exception{

            int ok;
            ok=pstm.executeUpdate();
            return ok;
    }
    public ResultSet executeSelect() throws  Exception{

        rs = pstm.executeQuery();
        return rs;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void  closeConnection() throws Exception{

        if (cnx != null)
            cnx.close();
    }
}