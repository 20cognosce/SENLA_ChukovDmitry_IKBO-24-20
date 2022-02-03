package Task3;

import Task5.Item;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class StringHandler {
    final String initial_line;
    String modified_line;
    LinkedList<Word> words = new LinkedList<>();

    StringHandler(String initial_line) {
        this.initial_line = initial_line;
    }

    void splitInitialLine(){
        StringTokenizer tokenizer = new StringTokenizer(initial_line, " ");
        words.clear();

        while (tokenizer.hasMoreTokens()) {
            words.add(new Word(tokenizer.nextToken()));
        }
    }

    int countVowels() {
        int sum = 0;
        for (Word word : words) {
            sum += word.countVowels();
        }
        return sum;
    }

    void sortWords() {
        words.sort(((Word a, Word b) -> -Integer.compare(a.getNumberOfVowels(),b.getNumberOfVowels())));
    }

    String getWords() {
        StringBuilder sortedWords = new StringBuilder();
        for (Word word: this.words) {
            sortedWords.append(word.getContent()).append(" ");
        }
        return sortedWords.toString();

    }
    void makeFirstVowelCapital(){
        for (Word word: this.words) {
            word.makeFirstVowelCapital();
        }
    }
}
