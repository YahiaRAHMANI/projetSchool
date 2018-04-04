public class Individu{

    private int idInd;
    private String nomInd;
    private String prenomInd;
    private String adresseInd;
    private String telephoneInd;
    private String emailInd;
    private int statut;
    private String identifiant;
    private String motDePasseInd;

    public Individu() {
    }

    public Individu(int idInd, String nomInd, String prenomInd, String adresseInd, String telephoneInd, String emailInd, int statut, String identifiant, String motDePasseInd) {
        this.idInd = idInd;
        this.nomInd = nomInd;
        this.prenomInd = prenomInd;
        this.adresseInd = adresseInd;
        this.telephoneInd = telephoneInd;
        this.emailInd = emailInd;
        this.statut = statut;
        this.identifiant = identifiant;
        this.motDePasseInd = motDePasseInd;
    }

    public int getIdInd() {
        return idInd;
    }

    public void setIdInd(int idInd) {
        this.idInd = idInd;
    }

    public String getNomInd() {
        return nomInd;
    }

    public void setNomInd(String nomInd) {
        this.nomInd = nomInd;
    }

    public String getPrenomInd() {
        return prenomInd;
    }

    public void setPrenomInd(String prenomInd) {
        this.prenomInd = prenomInd;
    }

    public String getAdresseInd() {
        return adresseInd;
    }

    public void setAdresseInd(String adresseInd) {
        this.adresseInd = adresseInd;
    }

    public String getTelephoneInd() {
        return telephoneInd;
    }

    public void setTelephoneInd(String telephoneInd) {
        this.telephoneInd = telephoneInd;
    }

    public String getEmailInd() {
        return emailInd;
    }

    public void setEmailInd(String emailInd) {
        this.emailInd = emailInd;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasseInd() {
        return motDePasseInd;
    }

    public void setMotDePasseInd(String motDePasseInd) {
        this.motDePasseInd = motDePasseInd;
    }
}