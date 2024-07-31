import java.util.ArrayList;

public class AffichagePrevisions implements Observer, Affichage  {
    private float temperature;
    private float humidite;
    private float MaxT ;
    private float MinT ;
    private float MaxH ;
    private float MinH ;
    ArrayList <Float> temp =new ArrayList<Float>();
    ArrayList <Float> Hum =new ArrayList<Float>();
    ArrayList <Float> press =new ArrayList<Float>();
    

    @Override
    public void update(float t, float h) {
        // TODO Auto-generated method stub
        this.setTemperature(t);
        this.setHumidite(h);
        afficher(); 
    }
  
    @Override
    public void afficher() {
        // TODO Auto-generated method stub
        System.out.println(" Actualement lesPrevisions  sont les suivantes:"+
        MinT+"->la valeur min de la température et  valeur max de la température est  ->"+MaxT);
 
    }

   
 /* 
    public void getMAXT(ArrayList<Float>[]temp){
        ArrayList<Float> MaxT= temp[0]; 
        for (int i=0 ; i< temp.length;i++){
            if (temp[i]>MaxT){
                MaxT=temp[i];

            }

        }
         
        System.out.println("la valeur Max est "+MaxT);
    }
    public void getMINT(ArrayList<Float>[]temp){
        float MinT= temp[0]; 
        for (int i=0 ; i< temp.length;i++){
            if (temp[i]<MinT){
                MinT=temp[i];

            }
        }
         
        System.out.println("la valeur min est "+MinT);
    }
   
    public void getMoy(ArrayList<Float>[]temp){
        float somme=0 ;
        for (int i=0 ; i< temp.length;i++){
            somme=somme+temp[i];
            float moy =somme/temp.length;
        }

                 
        System.out.println("la m");
    }
    */
    public void getcurrentVal(){
        

    }
    public void getlastVal(){

    }

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidite() {
		return humidite;
	}

	public void setHumidite(float humidite) {
		this.humidite = humidite;
	}

	public float getMaxH() {
		return MaxH;
	}

	public void setMaxH(float maxH) {
		MaxH = maxH;
	}

	public float getMinH() {
		return MinH;
	}

	public void setMinH(float minH) {
		MinH = minH;
	}
   
}
