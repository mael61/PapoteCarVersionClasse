package papoteCarSimple;

public class voyage {
	ville depart;
	ville etapes;
	personne p1;
	public voyage(ville depart, ville etapes, personne p1) {
		super();
		this.depart = depart;
		this.etapes = etapes;
		this.p1 = p1;
	}
	@Override
	public String toString() {
		return "voyage [depart=" + depart + ", etapes=" + etapes + ", p1=" + p1 + "]";
	}



}
