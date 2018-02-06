package papoteCarSimple;

public class vehicule {
	personne conducteur;
	int NbMax;
	String marques;
	
	public vehicule(personne conducteur, int nbMax, String marques) {
		super();
		this.conducteur = conducteur;
		NbMax = nbMax;
		this.marques = marques;
	}



	public void add(voyage voy1) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "vehicule [conducteur=" + conducteur + ", NbMax=" + NbMax + ", marques=" + marques + "]";
	}

	
	
	

}
