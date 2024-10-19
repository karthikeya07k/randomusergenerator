import java.util.Random;

public class RandomUserGenerator {

    private static final String DOMAIN = "example.com"; // Change this to your desired domain
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
    private static final Random RANDOM = new Random();

    public static String generateRandomEmail() {
        StringBuilder username = new StringBuilder();
        int usernameLength = RANDOM.nextInt(8) + 5; // Length between 5 and 12
        for (int i = 0; i < usernameLength; i++) {
            username.append((char) (RANDOM.nextInt(26) + 'a')); // Random lowercase letters
        }
        return username + "@" + DOMAIN;
    }

    public static String generateRandomPassword(int length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Generate 5 random emails and passwords
            String email = generateRandomEmail();
            String password = generateRandomPassword(12); // Password length of 12
            System.out.println("Email: " + email + ", Password: " + password);
        }
    }
}
