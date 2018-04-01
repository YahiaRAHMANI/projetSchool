public class Frequence{

    private int idFrequence;
    private String libelFrequence;

    public Frequence(int idFrequence, String libelFrequence) {
        this.idFrequence = idFrequence;
        this.libelFrequence = libelFrequence;
    }

    public int getIdFrequence() {
        return idFrequence;
    }

    public void setIdFrequence(int idFrequence) {
        this.idFrequence = idFrequence;
    }

    public String getLibelFrequence() {
        return libelFrequence;
    }

    public void setLibelFrequence(String libelFrequence) {
        this.libelFrequence = libelFrequence;
    }
}