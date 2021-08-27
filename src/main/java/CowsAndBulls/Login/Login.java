package CowsAndBulls.Login;

import CowsAndBulls.DbHelper.DbConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static boolean login() {


        System.out.print("Enter username: ");
        String username = scanner.next().trim();

        System.out.print("Enter password: ");
        String password = scanner.next().trim();

        try {
            ps = DbConn.getConnection().prepareStatement("SELECT * FROM Users" +
                    " WHERE username='" + username + "', password='" + password + "'");
            rs = ps.executeQuery();
            String passwordCheck = "";
            while(rs.next()) {
                passwordCheck = rs.getString(password);
            }
            return passwordCheck.equals(password);

        } catch (SQLException e) {
//            e.printStackTrace();
            System.out.println("Incorrect username or password");
            return false;

        }
    }
}
