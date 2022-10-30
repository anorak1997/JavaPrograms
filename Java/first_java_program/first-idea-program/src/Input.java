import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Roll Number: ");
        int rollNumber = input.nextInt();
        System.out.println("Your rollNum is: " + rollNumber);

        int a = 234_000_000 ; //This represent 234 million. In place of "," we use "_".
        System.out.println(a);
//Check for the error below here
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
}
