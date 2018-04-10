
public class Etablissement {

    private int idEtablissement;
    private int idMateriel;
    private String nomEtablissement;
    private String annee;
    private String semaine;
    private String session;

    public Etablissement() {
    }

    public Etablissement(int idEtablissement, int idMateriel, String nomEtablissement, String annee, String semaine, String session) {
        this.idEtablissement = idEtablissement;
        this.idMateriel = idMateriel;
        this.nomEtablissement = nomEtablissement;
        this.annee = annee;
        this.semaine = semaine;
        this.session = session;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public int getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(int idMateriel) {
        this.idMateriel = idMateriel;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
    
    
}
