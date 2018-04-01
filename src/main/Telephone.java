import java.util.*;

public class Telephone{

    private int idTelephone;
    private int idIndividu;
    private int mobileTelephone;
    private int fixeTelephone;
    private String prenomContactTelephone;
    private String nomContactTelephone;
    private int mobileContactTelephone;
    private int fixeContactTelephone;
    private String lienContactTelephone;

    public Telephone(int idTelephone, int idIndividu, int mobileTelephone, int fixeTelephone, String prenomContactTelephone, String nomContactTelephone, int mobileContactTelephone, int fixeContactTelephone, String lienContactTelephone) {
        this.idTelephone = idTelephone;
        this.idIndividu = idIndividu;
        this.mobileTelephone = mobileTelephone;
        this.fixeTelephone = fixeTelephone;
        this.prenomContactTelephone = prenomContactTelephone;
        this.nomContactTelephone = nomContactTelephone;
        this.mobileContactTelephone = mobileContactTelephone;
        this.fixeContactTelephone = fixeContactTelephone;
        this.lienContactTelephone = lienContactTelephone;
    }

    public int getIdTelephone() {
        return idTelephone;
    }

    public void setIdTelephone(int idTelephone) {
        this.idTelephone = idTelephone;
    }

    public int getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
    }

    public int getMobileTelephone() {
        return mobileTelephone;
    }

    public void setMobileTelephone(int mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }

    public int getFixeTelephone() {
        return fixeTelephone;
    }

    public void setFixeTelephone(int fixeTelephone) {
        this.fixeTelephone = fixeTelephone;
    }

    public String getPrenomContactTelephone() {
        return prenomContactTelephone;
    }

    public void setPrenomContactTelephone(String prenomContactTelephone) {
        this.prenomContactTelephone = prenomContactTelephone;
    }

    public String getNomContactTelephone() {
        return nomContactTelephone;
    }

    public void setNomContactTelephone(String nomContactTelephone) {
        this.nomContactTelephone = nomContactTelephone;
    }

    public int getMobileContactTelephone() {
        return mobileContactTelephone;
    }

    public void setMobileContactTelephone(int mobileContactTelephone) {
        this.mobileContactTelephone = mobileContactTelephone;
    }

    public int getFixeContactTelephone() {
        return fixeContactTelephone;
    }

    public void setFixeContactTelephone(int fixeContactTelephone) {
        this.fixeContactTelephone = fixeContactTelephone;
    }

    public String getLienContactTelephone() {
        return lienContactTelephone;
    }

    public void setLienContactTelephone(String lienContactTelephone) {
        this.lienContactTelephone = lienContactTelephone;
    }
}