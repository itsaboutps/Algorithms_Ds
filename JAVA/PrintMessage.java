import java.util.Scanner;

// Take name as input and print a greeting message for that name.

public class PrintMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name ");
        // https://www.geeksforgeeks.org/difference-between-next-and-nextline-methods-in-java/
        //next()-----> This method can read the input only until a space(” “) is encountered
        String name = sc.nextLine();
        System.out.println("Greeting from VSCODE :: " + name);

    }
}
