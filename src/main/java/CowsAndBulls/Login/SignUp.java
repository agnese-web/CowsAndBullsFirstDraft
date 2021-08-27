package CowsAndBulls.Login;
import CowsAndBulls.DbHelper.DbConn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class SignUp {

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;


    public static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.next().trim();

        System.out.print("Enter password: ");
        String password = scanner.next().trim();

        try {
            ps = DbConn.getConnection().prepareStatement("INSERT INTO Users(username, password) VALUES('" + username + "','" + password + "')");
            ps.execute();
            System.out.println("User created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Unable to sign up, username already exists");
        }
    }
}
