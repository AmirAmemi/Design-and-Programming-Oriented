package Pd;

public class Entrepise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Departement departement = new Departement("HRip");
		Poste p=new Poste(32.0,"ingenieur en data sience");
		Employees e=new Employees("Monsieurx",21);
		e.masse_salariale();
		departement.masse_salariale();
	}

}
