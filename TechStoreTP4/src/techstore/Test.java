package techstore;

public class Test {
	
	public static void main(String[] args) {
	
	
	Adresse a1= new Adresse("Monastir",5000);
	Adresse a2= new Adresse("Ben Arous",1133);
	Adresse a3= new Adresse("Ben Arous",1145);
	System.out.println(a1.toString());
	 System.out.println(a2.toString());
	 System.out.println(a3.toString());
	
	Personne p1=new Personne("01111111","kbayer","lasser","jendouba",8160);
	Personne p2=new Personne("02222222","Smida","Ghayth",a1);
	
	 System.out.println(p1.toString());
	 System.out.println(p2.toString());
	 
	 p1.setNom("zrafi");
	 p1.setPrenom("yassine");
	  
	 p1.setAdresse(a1);
	 System.out.println("after changes");
		
	 System.out.println(p1.toString());
	 System.out.println(p2.toString());
	 
	 
	 
	 
	 
	 
	}
	

}
