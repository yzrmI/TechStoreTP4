package techstore;

public class Adresse {
    private String gouvernorat;
    private int codePostal; 
    
    public Adresse(String gouv, int codePo) {
        this.gouvernorat = gouv;
        this.codePostal = codePo;
    }

    public String toString() {

        return "adresse[ gouvernorat= " + this.gouvernorat + " codepostal = " + this.codePostal + "]";}
    
    public String getGouvernorat() {
        return gouvernorat;
    }
    
    public int getCodePostal() {
        return codePostal;
    }
    
    public void setGouvernorat(String gouv) {
        this.gouvernorat = gouv;
    }
    
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
}