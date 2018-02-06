package papoteCarSimple;

public class main {
	public static void main(String[] args) {
	  ville depart = new ville("Paris");
	  ville arriver = new ville("Bordeau");
	  ville etapes = new ville("Poitier");
	  personne conducteur = new personne("Richard");
 	  vehicule v1 = new vehicule(conducteur,5, "Peugeot");
 	  ville etape = new ville("Nantes");
 	  ville etape2 = new ville("Saint-Nazaire");
	  
	  
	  trajet t1 = new trajet(depart,arriver,v1);

 	  personne p1 = new personne("Paul");
 	 personne p2 = new personne("Pierre");
 	  
 	  
 	  voyage voy1 = new voyage(depart,etapes,p1);
 	  voyage voy2=new voyage (etape,etape2,p2);
 	  t1.add (voy1);
 	  t1.addEtape(etape);
 	  t1.addEtape(etape2);
 	  t1.add(voy2);

 	 System.out.println(t1); 
	  
	}
}
