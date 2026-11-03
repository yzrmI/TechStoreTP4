package techstore;

import java.util.Objects;

public class Element {
	private Article article;
	private long quantite;
	
	public Element(Article darticle,long dquantite) {
		this.quantite=dquantite;
		this.article=darticle;
	}
	
	public Element(String dnom,double dprix,long dquantite) {
		this.quantite=dquantite;
		this.article=new Article(dnom,dprix);}
	
	public Article getArticle() {
		return article;
		
	}
	public long getQunatite() {
		return quantite;
	}
	public String getReferenceArticle() {
		return article.getReference();
	}
	public String getReferenceNom() {
		return article.getNom();
	}
	public double getPrix() {
		return article.getPrix();
	}
	public void setArticle(Article darticle) {
		this.article=darticle;
	}
	public void setQuantite(long dquantite) {
		if(this.quantite>dquantite){
		this.quantite=dquantite;}
		else{System.out.println("la quantite est unsifisent");}
	}
	public void incrementerQiantite(long dquantite) {
		this.quantite=quantite+dquantite;
	}
	public void decrementerQiantite(long dquantite) {
		this.quantite=quantite-dquantite;
	}
	public void modifier(String dnom,double dprix,long dquantite){
		this.article= new  Article(dnom,dprix);
		this.quantite=dquantite;
	}
	public boolean equuals(String dref){
		if (this.article.getReference().equals(dref)){
		return true ;}
		else return false;
	}
	public boolean equals(Article dArticle){
		return Objects.equals(this.article.getReference(), dArticle.getReference());
	}


public String toString() {
    return "Element [article=" + article.toString() + ", quantite=" + quantite + "]";
}
}