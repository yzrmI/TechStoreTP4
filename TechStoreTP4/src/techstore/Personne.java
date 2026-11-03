package techstore;

public class Personne {
	private String cin;
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	public Personne(String dcin,String dnom,String dprenom,Adresse dadresse) {
		
		this.cin=dcin;
		this.nom=dnom;
		this.prenom=dprenom;
		this.adresse=dadresse;
	}
	public Personne(String dcin,String dnom,String dprenom,String gouv, int codePo) {
		
		this.cin=dcin;
		this.nom=dnom;
		this.prenom=dprenom;
		this.adresse=new Adresse(gouv,codePo);
	}
	
	public String getCin() {
		return cin;
	}
	public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    public void setNom(String dnom) {
    	this.nom=dnom;
    	
    }
    public void setPrenom(String dprenom) {
    	this.prenom=dprenom;
    	
    }
    public void setAdresse(Adresse dadresse) {
    	this.adresse=dadresse;
    }
    
    public String toString() {
    	return "cin=" + this.cin + ", nom="+ this.nom +", prenom="+ this.prenom +" , "+ this.adresse.toString();
    } 
    
	

}
