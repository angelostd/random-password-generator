package password_generator;

import java.util.*;

public class Password_Generator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the length of the array of passwords|: ");
        int lengthArray = Integer.parseInt(read.nextLine());
        Password[] array = new Password[lengthArray];
        boolean[] strong = new boolean[lengthArray];
        System.out.print("Enter the length of each password in the array|: ");
        int lengthPassword = Integer.parseInt(read.nextLine());
        for (int i = 0; i < array.length; i++) {
            Password password = new Password(lengthPassword);
            int index = i+ 1;
            array[i] = password;
            strong[i] = password.isStrong();
            System.out.println("\nPassword\t" + index + ":\t" + array[i].getPassword() + "\nIt is strong?\t" + index + ":\t" + strong[i]);
        }
    }
}