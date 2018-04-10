
public class Materiel {

    private int idMateriel;
    private float tarif;

    public Materiel() {
    }

    public Materiel(int idMateriel, float tarif) {
        this.idMateriel = idMateriel;
        this.tarif = tarif;
    }

    public int getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(int idMateriel) {
        this.idMateriel = idMateriel;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
    
    
}
