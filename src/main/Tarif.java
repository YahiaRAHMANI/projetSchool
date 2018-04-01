public class Tarif{

    private int idTarif;
    private float fraisInscTarif;
    private float CotisTarif;
    private float remDurTarif;
    private float remModTarif;

    public Tarif(int idTarif, float fraisInscTarif, float cotisTarif, float remDurTarif, float remModTarif) {
        this.idTarif = idTarif;
        this.fraisInscTarif = fraisInscTarif;
        CotisTarif = cotisTarif;
        this.remDurTarif = remDurTarif;
        this.remModTarif = remModTarif;
    }

    public int getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public float getFraisInscTarif() {
        return fraisInscTarif;
    }

    public void setFraisInscTarif(float fraisInscTarif) {
        this.fraisInscTarif = fraisInscTarif;
    }

    public float getCotisTarif() {
        return CotisTarif;
    }

    public void setCotisTarif(float cotisTarif) {
        CotisTarif = cotisTarif;
    }

    public float getRemDurTarif() {
        return remDurTarif;
    }

    public void setRemDurTarif(float remDurTarif) {
        this.remDurTarif = remDurTarif;
    }

    public float getRemModTarif() {
        return remModTarif;
    }

    public void setRemModTarif(float remModTarif) {
        this.remModTarif = remModTarif;
    }
}