package Task3;

import Task2.NumberHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberHandler numberHandler = new NumberHandler();
        Scanner sc = new Scanner(System.in);
        String line;
        System.out.println("Enter your sentence: ");
        line = sc.nextLine();

        StringHandler stringHandler = new StringHandler(line);
        stringHandler.splitInitialLine();
        System.out.println("Number of vowels in this sentence: " + stringHandler.countVowels());

        stringHandler.sortWords();
        System.out.println("Words in the sorted order: " + stringHandler.getWords());

        stringHandler.splitInitialLine(); //to restore initial order of words
        stringHandler.makeFirstVowelCapital();
        System.out.println("Sentence with first vowels made capital: " + stringHandler.getWords());

        //Tested: Мороз и солнце; день чудесный! Еще ты дремлешь, друг прелестный - Пора, красавица, проснись
    }
}
