package techstore;

public class Article {
	
	private static int countid=-1;
	private int id;
	private String nom;
	private String reference;
	private double prix;
    public static String genererReference(String nom, int id) {
        int d = nom.length();
        String ch = "";

        for (int i = 0; i < d; i += 5) {
            if (nom.charAt(i)!=' '){
            ch = ch + nom.charAt(i);}}
        return ch+id;}
    
    
	public Article (String dnom,double dprix) {
		countid=countid +1 ;
		this.id=countid;
		this.nom=dnom;
		this.reference=genererReference(dnom,this.id);
		this.prix=dprix;	
	}
	public int getId() {
		return id;
		
	}
	public String getNom() {
		return nom;
		
	}
	public String getReference() {
		return reference;
		
	}
	public double getPrix() {
		return prix;
	}
	
	public void setReference(String dreference) {
		this.reference = dreference;
	}
	public void SetNom(String dnom) {
		this.nom=dnom;
	}
	public void setPrix(double dprix) {
		this.prix=dprix;
	}
	
	public void modifier(String dnom) {
		this.nom=dnom;
		this.reference=genererReference(dnom,this.id);
	}
	
	public void modifier(String dnom,double dprix) {
		this.nom=dnom;
		this.prix=dprix;
		this.reference=genererReference(dnom,this.id);
		
	}
	
	public String toString() {
		return "id=" + this.id + ", nom=" + this.nom + ", reference=" + this.reference + ", prix=" + this.prix;
	}

	
	
}
