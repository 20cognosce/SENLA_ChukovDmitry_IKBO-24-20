package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberHandler numberHandler = new NumberHandler();

        Scanner sc = new Scanner(System.in);
        String number;
        System.out.println("Enter your number: ");
        number = sc.nextLine();

        try {
        numberHandler.factorizeNumber(number);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(numberHandler.getPrimeFactors());
    }
}
