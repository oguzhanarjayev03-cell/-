public class PasswordChecker {

    public static int calculateScore(String password) {
        int score = 0;

        if (password == null || password.isEmpty()) {
            return 0;
        }

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[^a-zA-Z0-9].*")) score++;

        return score;
    }

    public static String getStrength(int score) {
        if (score <= 2) {
            return "Weak password";
        } else if (score <= 4) {
            return "Medium password";
        } else {
            return "Strong password";
        }
    }
}
