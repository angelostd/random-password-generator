package password_generator;

import java.util.*;

public class Password {

    String password = "";
    public int length = 8;

    private static char[] ALPHA_UPPER_CHARACTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static char[] ALPHA_LOWER_CHARACTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static char[] NUMERIC_CHARACTERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static char[] SPECIAL_CHARACTERS = {'~', '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{', ']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/', '?'};

    public Password() {

    }

    public Password(int length) {
        String generatePassword[] = new String[length];
        for (int i = 0; i < length; i++) {
            int charAlphaPicker = (int) ((Math.random() * 4) + 1);
            int charBetaPicker = 0;
            switch (charAlphaPicker) {
                case 1:
                    charBetaPicker = (int) (Math.random() * 26);
                    generatePassword[i] = String.valueOf(ALPHA_UPPER_CHARACTERS[charBetaPicker]);
                    break;
                case 2:
                    charBetaPicker = (int) (Math.random() * 26);
                    generatePassword[i] = String.valueOf(ALPHA_LOWER_CHARACTERS[charBetaPicker]);
                    break;
                case 3:
                    charBetaPicker = (int) (Math.random() * 10);
                    generatePassword[i] = String.valueOf(NUMERIC_CHARACTERS[charBetaPicker]);
                    break;
                case 4:
                    charBetaPicker = (int) (Math.random() * 32);
                    generatePassword[i] = String.valueOf(SPECIAL_CHARACTERS[charBetaPicker]);
                    break;
            }
        }
        for (int i = 0; i < length; i++) {
            password += String.valueOf(generatePassword[i]);
        }
    }

    public boolean isStrong() {
        boolean strong = false;
        int uppercase = 0, lowercase = 0, numbers = 0, spchars = 0;
        char[] charArray = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            charArray[i] = password.charAt(i);
        }
        for (char c : charArray) {
            for (char upper : ALPHA_UPPER_CHARACTERS) {
                if (c == upper) {
                    uppercase++;
                }
            }
            for (char lower : ALPHA_LOWER_CHARACTERS) {
                if (c == lower) {
                    lowercase++;
                }
            }
            for (char number : NUMERIC_CHARACTERS) {
                if (c == number) {
                    numbers++;
                }
            }
            for (char spchar : SPECIAL_CHARACTERS) {
                if (c == spchar) {
                    spchars++;
                }
            }
        }
        if ((uppercase >= 1) && (lowercase >= 1) && (numbers >= 1) && (spchars >= 1) && (password.length() >= 8)) {
            strong = true;
        }
        return strong;
    }

    public void generatePassword() {
        String generatePassword[] = new String[password.length()];
        length = password.length();
        password = "";
        for (int i = 0; i < length; i++) {
            int charAlphaPicker = (int) ((Math.random() * 4) + 1);
            int charBetaPicker = 0;
            switch (charAlphaPicker) {
                case 1:
                    charBetaPicker = (int) (Math.random() * 26);
                    generatePassword[i] = String.valueOf(ALPHA_UPPER_CHARACTERS[charBetaPicker]);
                    break;
                case 2:
                    charBetaPicker = (int) (Math.random() * 26);
                    generatePassword[i] = String.valueOf(ALPHA_LOWER_CHARACTERS[charBetaPicker]);
                    break;
                case 3:
                    charBetaPicker = (int) (Math.random() * 10);
                    generatePassword[i] = String.valueOf(NUMERIC_CHARACTERS[charBetaPicker]);
                    break;
                case 4:
                    charBetaPicker = (int) (Math.random() * 32);
                    generatePassword[i] = String.valueOf(SPECIAL_CHARACTERS[charBetaPicker]);
                    break;
            }
        }
        for (int i = 0; i < length; i++) {
            password += String.valueOf(generatePassword[i]);
        }
    }

    public String getPassword() {
        return password;

    }

    public int getLength() {
        return length;

    }

    public void setLength() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the new value of length|: ");
        this.length = Integer.parseInt(read.nextLine());
    }
}
