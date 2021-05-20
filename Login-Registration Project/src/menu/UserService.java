package menu;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Scanner;

public class UserService {
    public static void logIn(String username,String password) throws IOException {
        String[] arr = Files.readAllLines(Paths.get("src\\database.txt")).toArray(new String[0]);
        for(int i=0;i<arr.length;++i)
        {
            String[] arrSplit=arr[i].split(",");
            if(username.equals(arr[i].split(",")[1]) && md5(password).equals(arr[i].split(",")[3]))
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("Invalid input incorrect username or password");
    }

    public static void registration() throws IOException {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your username (must contain at least 10 characters)");
        String username=sc.next();

        while(searchUser(username) || username.length()<10)
        {
            if(username.length()<10)
            {
                System.out.println("Your username (must contain at least 10 characters)");
            }
            System.out.println("Username "+ username+ " already exists please enter another one");
            username=sc.next();
        }

        System.out.println("Please enter your full name (name surname)");
        String fullName=sc.nextLine();
        fullName+=sc.nextLine();
        String expression = "^[a-zA-Z\\s]+";
        while(!(fullName.matches(expression)))
        {
            System.out.println("Invalid input your input must look like  -> example: Benjamin Sargsyan ");
            fullName=sc.next();
        }
        System.out.println("Please enter an email ");
        sc.nextLine();
        String email=sc.next();
        expression="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        while(!(email.matches(expression)))
        {

            System.out.println("Invalid input your input must look like  -> example: example@gmail.com ");
            email=sc.next();

        }


        System.out.println("Please enter your password");
        System.out.println("Your password must contain 2 or more uppercase letters 3 or more digits and the length must"
                        + " be at least 8 characters");
        String password=sc.next();
        while(!(password.length()>=8 && digitCounter(password) && upperLetterCounter(password)))
        {
            System.out.println("Invalid input");
            System.out.println("Please enter your password");
            System.out.println("Your password must contain 2 or more uppercase letters 3 or more digits and the length must"
                    + " be at least 8 characters");
             password=sc.next();
        }

        String saveResult=fullName+","+username+","+email+","+md5(password);
        Files.write(Paths.get("src\\database.txt"),saveResult.getBytes());
    }


    private static String md5(String input) {
        String md5 = null;
        if(null == input) return null;
        try {
            //Create MessageDigest object for MD5
            MessageDigest digest = MessageDigest.getInstance("MD5");
            //Update input string in message digest
            digest.update(input.getBytes(), 0, input.length());
            //Converts message digest value in base 16 (hex)
            md5 = new BigInteger(1, digest.digest()).toString(16);
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5;
    }

    private static boolean digitCounter(String password)
    {
        int digitCount=0;
        for(int i=0;i<password.length();++i)
        {
            if(password.charAt(i)>='0' && password.charAt(i)<='9')
            {
                digitCount++;
                if(digitCount>=3)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean upperLetterCounter(String password )
    {
        int letterCount=0;
        for(int i=0;i<password.length();++i)
        {
            if(password.charAt(i)>='A' && password.charAt(i)<='Z')
            {
                letterCount++;
                if(letterCount>=2)
                {
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean searchUser(String Username) throws IOException {
        String[] arr = Files.readAllLines(Paths.get("src\\database.txt")).toArray(new String[0]);
        for(int i=0;i<arr.length;++i)
        {
            String[] x=arr[i].split(",");
            if(Username.equals(x[0]))
            {
                return true;
            }
        }
        return false;
    }


}
