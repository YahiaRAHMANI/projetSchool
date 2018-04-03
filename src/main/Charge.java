public class Charge {

    private int idCharge;
    private String nomCharge;
    private String typeCharge;
    private float montCharge;

    public Charge(int idCharge, String nomCharge, String typeCharge, float montCharge) {
        this.idCharge = idCharge;
        this.nomCharge = nomCharge;
        this.typeCharge = typeCharge;
        this.montCharge = montCharge;
    }

    public int getIdCharge() {
        return idCharge;
    }

    public void setIdCharge(int idCharge) {
        this.idCharge = idCharge;
    }

    public String getNomCharge() {
        return nomCharge;
    }

    public void setNomCharge(String nomCharge) {
        this.nomCharge = nomCharge;
    }

    public String getTypeCharge() {
        return typeCharge;
    }

    public void setTypeCharge(String typeCharge) {
        this.typeCharge = typeCharge;
    }

    public float getMontCharge() {
        return montCharge;
    }

    public void setMontCharge(float montCharge) {
        this.montCharge = montCharge;
    }
}
