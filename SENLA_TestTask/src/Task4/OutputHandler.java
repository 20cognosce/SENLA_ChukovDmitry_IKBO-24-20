package Task4;

import java.util.ArrayList;
import java.util.Collections;

public class OutputHandler {
    ArrayList<Integer> digits = new ArrayList<>();
    Character[][] finalArray;
    /* Чтобы вывести число в строку, приходится построчно объединять двумерные массивы цифр,
    из которых состоит заданное число, в один двумерный массив для вывода */

    void splitIntoDigits(int number) {
        digits.clear();

        if (number == 0) {
            digits.add(0);
            return;
        }

        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digits);
    }

    void initializeArray() {
        finalArray = new Character[7][digits.size() * 5 + digits.size() * 4]; //5 ячеек для цифры и 4 для табуляции
        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray[0].length; j++) {
                finalArray[i][j] = ' ';
            }
        }
    }

    void createArray(Alphabet alphabet) {
        int k = 0;
        for (Integer digit : digits) {
            char[][] temp = alphabet.findNumber(digit).getDesign();
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp[0].length; j++) {
                    finalArray[i][j+k] = temp[i][j];
                }
            }
            k+=9;
        }
    }

    void printNumber() {
        for (Character[] characters : finalArray) {
            for (int j = 0; j < finalArray[0].length; j++) {
                System.out.print(characters[j]);
            }
            System.out.println();
        }
    }

    void execute(int number, Alphabet alphabet) {
        splitIntoDigits(number);
        initializeArray();
        createArray(alphabet);
        printNumber();
    }
}
