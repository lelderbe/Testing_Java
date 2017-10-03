package jdbc.postgre_test;

//STEP 1. Import required packages
import java.sql.*;

/**
 * Created by user on 20.06.2017.
 */
public class PostgreJDBCTest {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/test1";

    //  Database credentials
    static final String USER = "users";
    static final String PASS = "123456";


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try{
            //STEP 2: Register JDBC driver
//            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();
            String sql;
            sql = "SELECT * FROM neighbours WHERE section = 7";
            ResultSet rs = statement.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String vk_id = rs.getString("vk_id");
                int building = rs.getInt("building");
                int section = rs.getInt("section");
                int floor = rs.getInt("floor");
                int flat = rs.getInt("flat");

                //Display values
                System.out.printf("id: %d, vk_id: %s, building: %d, section: %d, floor: %d, flat: %d%n", id, vk_id, building, section, floor, flat);
//                System.out.print("ID: " + id);
//                System.out.println(", vk_id: " + vk_id);
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            connection.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(statement!=null)
                    statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(connection!=null)
                    connection.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }

}
