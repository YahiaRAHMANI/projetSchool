
public class Assiduite {

    private int idAssiduite;
    private int idSeance;
    private String etat;

    public Assiduite() {
    }

    public Assiduite(int idAssiduite, int idSeance, String etat) {
        this.idAssiduite = idAssiduite;
        this.idSeance = idSeance;
        this.etat = etat;
    }

    public int getIdAssiduite() {
        return idAssiduite;
    }

    public void setIdAssiduite(int idAssiduite) {
        this.idAssiduite = idAssiduite;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
}
