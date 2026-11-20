import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Құпиясөзді енгізіңіз: ");
        String password = input.nextLine();

        int score = PasswordChecker.calculateScore(password);
        String strength = PasswordChecker.getStrength(score);

        System.out.println("Құпиясөз беріктігі: " + score + "/5");
        System.out.println("Бағасы: " + strength);

        if (score <= 2) {
            System.out.println("Ұсыныс: ұзын құпиясөз және сандар мен таңбаларды қолданыңыз.");
        } else if (score <= 4) {
            System.out.println("Ұсыныс: бас әріп пен арнайы таңба қосыңыз.");
        } else {
            System.out.println("Құпиясөз жақсы қорғалған!");
        }

        input.close();
    }
}
