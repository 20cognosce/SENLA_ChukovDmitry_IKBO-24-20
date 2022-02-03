package Task4;

import java.util.Scanner;

//Это было ужасно но оно работает
public class Main {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        OutputHandler outputHandler = new OutputHandler();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        try {
            int number = sc.nextInt();
            outputHandler.execute(Math.abs(number), alphabet);
        } catch (RuntimeException e) {
            System.out.println("Please, enter an integer number in range (-2147483648; 2147483647]");
        }
    }
}
