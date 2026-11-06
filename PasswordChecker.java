import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        if (password.matches(".*[a-z].*")) {
            score++;
        }

        if (password.matches(".*[0-9].*")) {
            score++;
        }

        if (password.matches(".*[^a-zA-Z0-9].*")) {
            score++;
        }

        System.out.println("Password strength score: " + score + "/5");

        if (score <= 2) {
            System.out.println("Weak password");
        } else if (score <= 4) {
            System.out.println("Medium password");
        } else {
            System.out.println("Strong password");
        }

        input.close();
    }
}
