package Main;

import sn.isi.entities.Client;
import sn.isi.traitement.*;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        DB db = new DB();
        int choix = 4;
        String rep = null;
        Scanner scan = new Scanner(System.in);
        System.out.println(":1 ---------PAGE DE CRÉATION  ---------------");
        System.out.println(":2----------PAGE DE ÉDITION ------------------ ");
        System.out.println(":3----------PAGE DE VISUALISATIOION ----------");
        System.out.println(":4----------PAGE DE RECHERCHE   --------------");

        choix  = Integer.parseInt(scan.nextLine());
        switch (choix)
        {
            case 1:
                do {

                    IClient ic = new ClientImp();
                    Client cl= new Client();
                    ic.add(cl);
                    System.out.print(":---------- Informations CLIENT  --------------\n,:");
                    System.out.println(" Le prénom du client  : "+cl.getPrenom());
                    System.out.println(" Le nom est du client  : "+cl.getNom());
                    System.out.println(" l'adresse email du client  : "+cl.getEmail());
                    System.out.println(" l'adresse password du client  : "+cl.getEmail());
                    System.out.println(" le téléphone du client  : "+cl.getTel());
                    System.out.println(" voulez-vous saisir a nouveau OUI/NON");
                    rep=scan.nextLine();

                }while(rep.equalsIgnoreCase("oui"));
                break;

            case 2 :
                IClient ic=new ClientImp();
                System.out.print("Donner l' email du client a modifier : ");
                String a=scan.nextLine();
                if (ic.update(a)==1){
                    System.out.println("Modification reussi!!!");
                }
                break;

            case 3 :
                IClient icl = new ClientImp();
                List<Client> listCl =icl.list();
                for (Client u1 : listCl){
                    System.out.println(" nom : "+u1.getNom());
                    System.out.println("prenom : "+u1.getPrenom());
                    System.out.println(" Tel  : "+u1.getTel());
                    System.out.println(" email : "+u1.getEmail());
                }
                break;

            case 4:
                Client c= new Client();
                IClient iC = new ClientImp();
                iC.searchClient(c.getEmail());
                break;
            default:
                System.out.print("Choix non disponible ");

        }



    }
}
