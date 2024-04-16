package exceptions;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter year of birth: ");
        int yearOfBirth = ip.nextInt(); // InputMismatchException >> uncheck exception

        System.out.println("Age:" + (LocalDate.now().getYear() - yearOfBirth + 1));

    }
}
