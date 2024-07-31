package Pd;

import java.util.ArrayList;
import java.util.List;

public class Departement extends Centre_interer {
	private List<Departement> departements=new ArrayList<Departement>();
	public Departement(String nom) {
		super(nom);
		
	}

	
	public void masse_salariale() {
		String scalier ="";
		for(int i=0; i<level;i++) {
			scalier="--";
			System.out.println(scalier+"Opération sur l'élément ("+nom+")");
			
		}
		for(Departement departement : departements) {
			departement.masse_salariale();
		}
		
	}

	
}
