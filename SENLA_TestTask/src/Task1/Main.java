package Task1;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("I was born on the 27th August of 2002");
        String str2 = new String("And I speak to myself what a wonderful world");
        LineHandler lineHandler = new LineHandler();

        System.out.println(lineHandler.summarizeDigits(str1));
        System.out.println(lineHandler.summarizeDigits(str2));
    }
}
