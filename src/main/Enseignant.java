public class Enseignant{

    private int idEnseignant;
    private int idAffectation;

    public Enseignant(int idEnseignant, int idAffectation) {
        this.idEnseignant = idEnseignant;
        this.idAffectation = idAffectation;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
}