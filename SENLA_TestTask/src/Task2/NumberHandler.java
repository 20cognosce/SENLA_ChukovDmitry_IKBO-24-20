package Task2;

import java.math.BigInteger;
import java.util.ArrayList;

public class NumberHandler {
    ArrayList<Integer> primeFactors = new ArrayList<>();

    void factorizeNumber(String number) throws RuntimeException {
        CheckNumberCorrectness(number);
        primeFactors.clear();
        BigInteger bNumber = new BigInteger(number);
        BigInteger i = BigInteger.valueOf(2);

        while(true) {
            if (bNumber.isProbablePrime(1)) {
                primeFactors.add(bNumber.intValue());
                break;
            }

            if (bNumber.mod(i).equals(BigInteger.ZERO)){
                primeFactors.add(i.intValue());
                bNumber = bNumber.divide(i);
            } else {
                i = i.add(BigInteger.ONE);
            }
        }
    }

    void CheckNumberCorrectness(String number) {
        try {
            Integer.parseInt(number);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Incorrect input. Number must be an integer");
        }
        if (Integer.parseInt(number) < 2) throw new IllegalArgumentException("Incorrect input. Number must be greater than 1");

        //if we did not manage to parse int then we should throw an exception
    }

    String getPrimeFactors() {
        StringBuilder output = new StringBuilder();
        for(Integer factor : primeFactors) {
            output.append(factor).append(" ");
        }
        return ("Prime Factors: " + output);
    }

}
