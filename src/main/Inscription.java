import java.util.*;
public class Inscription{

    private int idInscription;
    private int idEtudiant;
    private int idPaiment;
    private int idPrEnCharg;
    private Date dateInscription;
    private Date dateAbandInscription;
    private DatedateAnnulInscription;
    private int creditInscription;

    public Inscription(int idInscription, int idEtudiant, int idPaiment, int idPrEnCharg, Date dateInscription, Date dateAbandInscription, int creditInscription) {
        this.idInscription = idInscription;
        this.idEtudiant = idEtudiant;
        this.idPaiment = idPaiment;
        this.idPrEnCharg = idPrEnCharg;
        this.dateInscription = dateInscription;
        this.dateAbandInscription = dateAbandInscription;
        this.creditInscription = creditInscription;
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdPaiment() {
        return idPaiment;
    }

    public void setIdPaiment(int idPaiment) {
        this.idPaiment = idPaiment;
    }

    public int getIdPrEnCharg() {
        return idPrEnCharg;
    }

    public void setIdPrEnCharg(int idPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateAbandInscription() {
        return dateAbandInscription;
    }

    public void setDateAbandInscription(Date dateAbandInscription) {
        this.dateAbandInscription = dateAbandInscription;
    }

    public int getCreditInscription() {
        return creditInscription;
    }

    public void setCreditInscription(int creditInscription) {
        this.creditInscription = creditInscription;
    }
}