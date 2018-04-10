
public class Matiere {
    
    private int idMatiere;
    private String nomMatiere;
    private int idEnseignant;
    private int idProgramme;

    public Matiere() {
    }

    public Matiere(int idMatiere, String nomMatiere, int idEnseignant, int idProgramme) {
        this.idMatiere = idMatiere;
        this.nomMatiere = nomMatiere;
        this.idEnseignant = idEnseignant;
        this.idProgramme = idProgramme;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }
    
    
}
