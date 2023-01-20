package System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnector {
    private static DBConnector dbConnector;
    public DBConnector(){
    }
    public static DBConnector getDbConnector(){
        if (dbConnector == null){
            dbConnector = new DBConnector();
        }
        return dbConnector;
    }
    static final String URL = "jdbc:mysql://localhost/test_db";
    static final String USER = "root";
    static final String PASS = "GGG123GGg";
    static Connection conn = null;
    static Statement stmt = null;
    public static void connectToDB() {
        try{
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected database successfully...");
            createDB();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
//        System.out.println("Goodbye!");
    }

    public static void createDB(){
        try {
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            String sql = "CREATE TABLE test" +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Create succesful...");
        } catch (SQLException e){
            System.err.println("Ошибка при создании БД");
        }
    }
}
