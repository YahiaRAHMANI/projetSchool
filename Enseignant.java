
public class Enseignant extends Individu {
    
    private int idEnseignant;
    private int idEtablissement;

    public Enseignant() {
    }

    public Enseignant(int idEnseignant, int idEtablissement) {
        this.idEnseignant = idEnseignant;
        this.idEtablissement = idEtablissement;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }
    
    
}
