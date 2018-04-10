
import java.util.*;


public class Groupe {
    
    private int idGroupe;
    private int idSalle;
    private int idMatiere;
    private String horaire;
    //private List<Etudiant> listEtu = new ArrayList();

    public Groupe() {
    }

    public Groupe(int idGroupe, int idSalle, int idMatiere, String horaire) {
        this.idGroupe = idGroupe;
        this.idSalle = idSalle;
        this.idMatiere = idMatiere;
        this.horaire = horaire;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
    
    
    
}
