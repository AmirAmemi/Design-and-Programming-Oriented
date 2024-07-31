import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation{

  private static Journalisation uniqueInstance =null;
  private String log;
  
  private Journalisation (){
    log = new String();
  }

  public static synchronized Journalisation getInstance()
  {
    if (uniqueInstance == null){

      uniqueInstance = new Journalisation();
    }
    return uniqueInstance;
  }
// methode qui permet d'ajouter un message de log
  
  public void ajouterLog(String log)
  {
    Date d = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
    this.log+="["+dateFormat.format(d)+"]"+log+"\n";
  }


// methode qui retourne tous les messages de log 
  
 public String afficherLog(){
   return log;
 } 
 
}