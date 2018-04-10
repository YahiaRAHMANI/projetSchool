
public class Etudiant extends Individu {

    private int idEtudiant;
    private int idEtablissement;
    private int idGroupe;
    private String competence;
    private String assiduite;

    public Etudiant() {
    }

    public Etudiant(int idEtudiant, int idEtablissement, int idGroupe, String competence, String assiduite) {
        this.idEtudiant = idEtudiant;
        this.idEtablissement = idEtablissement;
        this.idGroupe = idGroupe;
        this.competence = competence;
        this.assiduite = assiduite;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getAssiduite() {
        return assiduite;
    }

    public void setAssiduite(String assiduite) {
        this.assiduite = assiduite;
    }
    
    
}
