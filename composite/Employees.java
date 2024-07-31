package Pd;

public class Employees extends Centre_interer{
public float nbh;
double mas;
	public Employees(String nom,float nbh) {
		super(nom);
		this.nbh=nbh;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void masse_salariale() {
		String scalier ="";
		for(int i=0; i<level;i++) {
			scalier="--";
			System.out.println(scalier+"Opération sur l'élément ("+nom+")");
			
			
		}
		
		mas= nbh*Poste.prixh;
		System.out.print(mas);
		
	}

}
