import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
       System.out.println("This is master branch");
        System.out.println("Enter the age:");
        int age = scanner.nextInt(); 

        if (age >= 18) { 
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    
        scanner.close();
    }
}