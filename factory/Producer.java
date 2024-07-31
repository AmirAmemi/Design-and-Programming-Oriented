public class Producer {
   public String  REP ;
   public void  getfactory(String REP){
     switch(REP){
        case "DriverAccess":
         DriverManager driver =  new DriverAccess();
         Connection conx = driver.getConnection();
         conx.traitment();
        break;
        case "DriverMysql":
         DriverManager driverMysql =  new DriverMysql();
         Connection conxsql = driverMysql.getConnection();
         conxsql.traitment();
        break;
         

     }

   }


    
}
