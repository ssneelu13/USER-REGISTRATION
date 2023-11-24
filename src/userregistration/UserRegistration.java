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


        

    }
}
