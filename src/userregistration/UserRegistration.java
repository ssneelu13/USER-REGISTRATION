package userregistration;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO USER REGISTRATION PROGRAM");
        //usecase1:enter valid first name
        System.out.println("enter a valid first name, it should start with capital letter and should contain atleast minimum 3 characters:");
        String firstName = scan.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",firstName));
        //usecase2:enter valid last name
        System.out.println("enter a valid last name, it should start with capital letter and should contain atleast minimum 3 characters:");
        String lastName = scan.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",lastName));
        //usecase3:enter valid email id
        System.out.println("enter a valid email address, example-xyz@gmail.com");
        String emailId = scan.nextLine();
        System.out.println(Pattern.matches("[a-z0-9]+[@][a-z]+[.][a-z]{2,3}",emailId));
        //usecase4:enter valid phone number
        System.out.println("enter a valid phone number starting with '+' symbol with respective country code then followed by your 10digit number:");
        String phoneNumber = scan.nextLine();
        System.out.println(Pattern.matches("[+]\\d{2}[ ]\\d{10}",phoneNumber));
        //usecase5:enter valid password
        System.out.println("enter a valid password:");
        System.out.println("rule1-enter a valid password that contain minimum 8 characters");
        System.out.println("rule2-enter a valid password that contain atleast one uppercase");
        System.out.println("rule3-enter a valid password that contain atleast one numeric value");
        System.out.println("rule4-enter a valid password that contain atleast one special characters");
        String password = scan.nextLine();
        System.out.println(Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*-?]).{8,15}",password));





    }
}
