package sn.isi.dao;

import sn.isi.entities.User;

public class UserImp implements IUser{
    private  DB db= new DB();
    private int ok;
    @Override
    public int add(User u) {
        String sql = "INSERT INTO user VALUES(NULL, ? ,?,? ,?)";
        try {
            db.init(sql);
            db.getPstm().setString(1, u.email);
            db.getPstm().setString(1, u.password);
            db.getPstm().setString(1, u.prenom);
            db.getPstm().setString(1, u.password);
            ok= db.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }
}
