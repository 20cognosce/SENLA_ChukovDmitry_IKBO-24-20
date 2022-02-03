package Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Alphabet {
    Map<ConsoleDigit,ArrayList<Integer>> multiMap = new HashMap<>();
    //key - is the number to print
    //arraylist - 12 parameters that tell, which row or column to remove

    Alphabet() {
        setPatternForZero();
        setPatternForOne();
        setPatternForTwo();
        setPatternForThree();
        setPatternForFour();
        setPatternForFive();
        setPatternForSix();
        setPatternForSeven();
        setPatternForEight();
        setPatternForNine();
    }

    void setPatternForZero() {
        ConsoleDigit zero = new ConsoleDigit(0);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                //первые три параметра в каждой строчке отвечают за выбор удаляемой горизонтали
                //вторые три - вертикали
                //для каждого из двух циклов
                add(3); add(7); add(999); add(1); add(4); add(1);
                add(0); add(0); add(0); add(0); add(0); add(0);
            }
        };
        zero.receivePattern(pattern);
        this.multiMap.put(zero, pattern);
    }

    void setPatternForOne() {
        ConsoleDigit one = new ConsoleDigit(1);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(0); add(7); add(3); add(0); add(4); add(1);
                add(0); add(7); add(1); add(0); add(1); add(1);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForTwo() {
        ConsoleDigit one = new ConsoleDigit(2);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(1); add(3); add(1); add(0); add(1); add(1);
                add(4); add(6); add(1); add(4); add(5); add(1);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForThree() {
        ConsoleDigit one = new ConsoleDigit(3);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(1); add(3); add(1); add(0); add(1); add(1);
                add(4); add(6); add(1); add(0); add(1); add(1);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForFour() {
        ConsoleDigit one = new ConsoleDigit(4);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(0); add(7); add(6); add(1); add(4); add(1);
                add(4); add(7); add(1); add(0); add(1); add(1);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForFive() {
        ConsoleDigit one = new ConsoleDigit(5);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(1); add(3); add(1); add(4); add(5); add(1);
                add(4); add(6); add(1); add(0); add(1); add(1);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForSix() {
        ConsoleDigit one = new ConsoleDigit(6);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(1); add(3); add(1); add(4); add(5); add(1);
                add(0); add(0); add(0); add(0); add(0); add(0);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForSeven() {
        ConsoleDigit one = new ConsoleDigit(7);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(1); add(7); add(1); add(0); add(1); add(1);
                add(3); add(7); add(3); add(0); add(4); add(1);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    void setPatternForEight() {
        ConsoleDigit zero = new ConsoleDigit(8);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(0); add(0); add(0); add(0); add(0); add(0);
                add(0); add(0); add(0); add(0); add(0); add(0);
            }
        };
        zero.receivePattern(pattern);
        this.multiMap.put(zero, pattern);
    }

    void setPatternForNine() {
        ConsoleDigit one = new ConsoleDigit(9);
        ArrayList<Integer> pattern = new ArrayList<>() {
            {
                add(4); add(6); add(1); add(0); add(1); add(1);
                add(0); add(0); add(0); add(0); add(0); add(0);
            }
        };
        one.receivePattern(pattern);
        this.multiMap.put(one, pattern);
    }

    ConsoleDigit findNumber(int numberToFind) {
        for (var number : multiMap.keySet()) {
            if (number.getValue() == numberToFind) {
                return number;
            }
        }
        throw new NoSuchElementException();
    }
}
