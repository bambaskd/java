package sn.isi.traitement;

import sn.isi.entities.Client;

import java.util.List;

public interface IClient {
    public int add (Client c) throws Exception;
    public int update (String email ) throws Exception;
    public Client get (String email) throws Exception;
    public List<Client> list()throws Exception;
    public String searchClient(String email) throws Exception;
}
