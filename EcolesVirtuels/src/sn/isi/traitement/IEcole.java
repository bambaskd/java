package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import java.util.Map;

public interface IEcole {
    public Map<Specialite, Ecole> saisi();
    public void affichageEcole(Map<Specialite, Ecole> Specialite);
}
