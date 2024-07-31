public class DriverMysql implements  DriverManager {

    @Override
    public Connection getConnection() {
        // TODO Auto-generated method stub
        return new MysqlConnection();
    }
    
}
