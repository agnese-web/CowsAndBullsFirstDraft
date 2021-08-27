package CowsAndBulls.DbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11432888", DbInfo.USERNAME.getValue(),
                    DbInfo.PASSWORD.getValue());
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
