package menu;

import java.io.IOException;
import java.util.Scanner;

// Ww@
public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            System.out.println("Welcome do you already have an account or you would like to sign Y/N ");
            String answer= sc.next();
            boolean in=true;
        while(in) {
            switch (answer) {
                case "Y":
                    UserService.registration();
                    System.out.println("Do you want to exit Y/N");
                    String ans = sc.next();
                    if (ans.charAt(0) == 'Y') {
                        in=false;
                    }
                case "N":
                    System.out.println("Please enter your username");
                    String username = sc.next();
                    System.out.println("Please enter your password");
                    String password = sc.next();
                    UserService.logIn(username, password);
                    System.out.println("Do you want to exit Y/N");
                     ans = sc.next();
                    if (ans.charAt(0) == 'Y') {
                        in=false;
                    }
            }
        }
    }
}
