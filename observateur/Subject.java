
public interface Subject {
   

   public void Delete(Observer observer) ;

      
   public void attach(Observer observer);
    

   public void notifyAllObservers();
      
}

