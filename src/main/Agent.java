public class Agent{

    private int idAgent;
    private int idAffectation;

    public Agent(int idAgent, int idAffectation) {
        this.idAgent = idAgent;
        this.idAffectation = idAffectation;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
}