package Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
    String content;
    Integer numberOfVowels;

    Word(String content) {
        this.content = content;
    }

    String getContent() {
        return this.content;
    }

    Integer getNumberOfVowels() {
        return this.numberOfVowels;
    }

    int countVowels() {
        int i = 0;
        Pattern pattern = Pattern.compile("[ауоыиэяюеёАУОЫИЭЯЮЕЁ]");
        Matcher matcher = pattern.matcher(this.content);

        while (matcher.find()) {
            i++;
        }
        this.numberOfVowels = i;
        return i;
    }

    void makeFirstVowelCapital() {
        String vowels = "ауоыиэяюеАУОЫИЭЯЮЕ";
        /* Ёё идут не по порядку в кодировке, не хочется из-за двух букв прописывать
        отдельные случаи, так как здесь это кажется не принципиальным */
        StringBuilder newContent = new StringBuilder(this.content);
        for (int i = 0; i < newContent.length(); i++) {
            if (vowels.contains(String.valueOf(newContent.charAt(i)))) {
                if ((int) newContent.charAt(i) >= 1072) {
                    //кодировка наименьшей прописной буквы - а (0430 в 16-тиричном коде Unicode)
                    newContent.setCharAt(i, (char) (newContent.charAt(i) - 32));
                    this.content = newContent.toString();
                }
                //Слышатся отголоски С++ в этом методе...) Может и можно было сделать красиво, но я не сообразил.
                return;
            }
        }
    }
}
