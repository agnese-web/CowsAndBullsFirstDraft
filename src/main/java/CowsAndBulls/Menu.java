package CowsAndBulls;

import java.util.Scanner;

import CowsAndBulls.Login.Login;
import CowsAndBulls.Login.SignUp;

public class Menu {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your action");
        System.out.println("1. Login");
        System.out.println("2. Sign Up");

        int option = scanner.nextInt();

        switch(option) {
            case 1:
                Login.login();
                break;
            case 2:
                SignUp.signUp();
                break;
            default:
                System.out.println("Choose valid option.");
        }


}
}
