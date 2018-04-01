import java.util.*;
public class Affectation{

   private int idAffectation;
   private int idContrat;
   private String trigrAffectation;
   private String loginAffectation;
   private String motPasseAffectation;
   private Date dateEntrAffectation;
   private Date datesortAffectation;
   /* TYPE PAS DEF
   private commAffectation;
   private ficheAffectation;
   private referentAffectation;
   private validAffectation;
   */

    public Affectation(int idAffectation, int idContrat, String trigrAffectation, String loginAffectation, String motPasseAffectation, Date dateEntrAffectation, Date datesortAffectation) {
        this.idAffectation = idAffectation;
        this.idContrat = idContrat;
        this.trigrAffectation = trigrAffectation;
        this.loginAffectation = loginAffectation;
        this.motPasseAffectation = motPasseAffectation;
        this.dateEntrAffectation = dateEntrAffectation;
        this.datesortAffectation = datesortAffectation;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public String getTrigrAffectation() {
        return trigrAffectation;
    }

    public void setTrigrAffectation(String trigrAffectation) {
        this.trigrAffectation = trigrAffectation;
    }

    public String getLoginAffectation() {
        return loginAffectation;
    }

    public void setLoginAffectation(String loginAffectation) {
        this.loginAffectation = loginAffectation;
    }

    public String getMotPasseAffectation() {
        return motPasseAffectation;
    }

    public void setMotPasseAffectation(String motPasseAffectation) {
        this.motPasseAffectation = motPasseAffectation;
    }

    public Date getDateEntrAffectation() {
        return dateEntrAffectation;
    }

    public void setDateEntrAffectation(Date dateEntrAffectation) {
        this.dateEntrAffectation = dateEntrAffectation;
    }

    public Date getDatesortAffectation() {
        return datesortAffectation;
    }

    public void setDatesortAffectation(Date datesortAffectation) {
        this.datesortAffectation = datesortAffectation;
    }
}