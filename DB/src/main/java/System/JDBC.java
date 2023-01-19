package System;

import static System.DBDespather.connectToDB;

public class JDBC {

    // JDBC driver name and database URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";


    public static void main(String[] args) {
        connectToDB();
    }
}
