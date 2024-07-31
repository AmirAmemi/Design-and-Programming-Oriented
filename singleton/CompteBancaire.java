public class CompteBancaire{

private int numero;
private double solde;

  public CompteBancaire (int numero)
  {
    this.numero=numero;
    this.solde=0.0;
  }
 
  public  void deposerArgent (double depot)
  {
    if (depot>0.0){ 
      solde+=depot;
      Journalisation.getInstance().ajouterLog("Depot de "+depot+"£ sur le compte "+numero);
    }
    else {
      Journalisation.getInstance().ajouterLog("Depot d'une valeur negative est impossible");
  }
  }
    
  public void retirerArgent (double retrait)
  {
    if (retrait>0.0){
      if (solde>=retrait)
       {
          solde-=retrait;
          Journalisation.getInstance().ajouterLog("retrait de "+retrait+"£ sur le compte "+numero);
       }
      else 
       {
          Journalisation.getInstance().ajouterLog("la banque n'autorise pas ");
       }
      
    }
    else {
      Journalisation.getInstance().ajouterLog("retrait d'une valeur negative est impossible");
  }  
  
}
  
  public void affiche () {
	  System.out.println("votre solde est "+this.solde+"£");
  }
 
}