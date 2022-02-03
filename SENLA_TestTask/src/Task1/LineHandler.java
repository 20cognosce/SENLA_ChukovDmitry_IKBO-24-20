package Task1;

public class LineHandler {
    int digits_sum;
    //idk is it ok to use _ instead of usual Camel notation, because in this case it looks strange: digitsSum

    int summarizeDigits(String line) {
        this.digits_sum = 0;
        char symbol;
        for (int i = 0; i < line.length(); i++) {
            symbol = line.charAt(i);
            if (Character.isDigit(symbol)) {
                digits_sum += Character.getNumericValue(symbol);
            }
        }
        return this.digits_sum;
    }
}
