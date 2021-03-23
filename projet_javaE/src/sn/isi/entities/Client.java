package sn.isi.entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String tel;

    public void saisiClient(){
        List<Client> listC=new ArrayList<>();
        Client c=new Client();
        Scanner sc=new Scanner(System.in);
        System.out.println(" donner l'id du client");


    }
    public Client() {
    }

    public Client(String nom, String prenom, String email, String password, String tel, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.tel = tel;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
