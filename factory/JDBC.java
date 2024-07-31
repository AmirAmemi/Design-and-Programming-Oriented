import java.util.Scanner;

public class JDBC{
    
    /**
     * @param args
     */
    public static void main (String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le  nom du driverManager souhaitez   DriverAccces/DriverMysql");
        String REP = sc.next();
        Producer factory =  new Producer() ;
        factory.getfactory(REP);

        

        
       
       

    }
}