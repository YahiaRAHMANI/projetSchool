
public class Paiement {

    private int idPaiement;
    private String moyenDePaiement;
    private boolean valide;
    //private Date datePaiement;
    
    public Paiement() {
    }

    public Paiement(int idPaiement, String moyenDePaiement, boolean valide) {
        this.idPaiement = idPaiement;
        this.moyenDePaiement = moyenDePaiement;
        this.valide = valide;
    }

    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public String getMoyenDePaiement() {
        return moyenDePaiement;
    }

    public void setMoyenDePaiement(String moyenDePaiement) {
        this.moyenDePaiement = moyenDePaiement;
    }

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }
    
    
}
