public class AffichageConditions implements Observer, Affichage{
    
    public float temperature;
    public float humidite;
    public Subject DonneesMeteo;

    /**
     * 
     */
    public AffichageConditions(){
        this.DonneesMeteo=DonneesMeteo;

    }

    public void afficher(){
        System.out.println(" Actualement les conditions sont les suivantes:"+
        temperature+"  et l'humidité "+humidite);
    }
    @Override
    public void update(float t, float h) {
        // TODO Auto-generated method stub
        this.temperature=t;
        this.humidite=h;
        afficher();

    }
   
   
}
