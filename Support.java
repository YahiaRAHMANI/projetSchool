
public class Support {

    private int idSupport;
    private String titre;
    private int idMatiere;
    private int idTypeDoc;
    private String libelle;

    public Support() {
    }

    public Support(int idSupport, String titre, int idMatiere, int idTypeDoc, String libelle) {
        this.idSupport = idSupport;
        this.titre = titre;
        this.idMatiere = idMatiere;
        this.idTypeDoc = idTypeDoc;
        this.libelle = libelle;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public int getIdTypeDoc() {
        return idTypeDoc;
    }

    public void setIdTypeDoc(int idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
    
}
