import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak password");
        } else {
            System.out.println("Password length is acceptable");
        }

        input.close();
    }
}
