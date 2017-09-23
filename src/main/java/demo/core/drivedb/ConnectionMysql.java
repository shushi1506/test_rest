package demo.core.drivedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {
    public Connection connected (String db_mysql_url,
                                 String db_mysql_user,
                                 String db_mysql_password)
    {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(db_mysql_url,db_mysql_user,db_mysql_password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closed( Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
