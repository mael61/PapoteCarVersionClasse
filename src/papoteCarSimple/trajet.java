package papoteCarSimple;

import java.util.ArrayList;



public class trajet {
	ville depart;
	ville arriver;
	vehicule v1;

	ArrayList<ville> Etapes = new ArrayList<ville>();
	ArrayList<voyage> Voyages = new ArrayList<voyage>();

	
	

	public trajet(ville depart, ville arriver, vehicule v1) {
		super();
		this.depart = depart;
		this.arriver = arriver;
		this.v1 = v1;
		
	}


	


	@Override
	public String toString() {
		return "trajet [depart=" + depart + ", arriver=" + arriver + ", v1=" + v1 + ", Etapes=" + Etapes + ", Voyages="
				+ Voyages + "]";
	}




	public void addEtape(ville etape) { 
		this.Etapes.add(etape);
		
	}





	public void add(voyage voy1) {
		// TODO Auto-generated method stub
		this.Voyages.add(voy1);
	}
	
	
	
	


}
