package Task4;

import java.util.ArrayList;

public class ConsoleDigit {
    int value;
    char[][] design = new char [7][5];

    ConsoleDigit(int value) {
        this.value = value;
        initializeDigit();
    }

    void initializeDigit() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                design[i][j] = ' '; //initialization
            }
        }
        //Everything is 8 by default
        for (int i = 0; i < 7; i+=3) {
            for (int j = 0; j < 5; j+=1) {
                design[i][j] = '*';
            }
        }
        for (int i = 0; i < 7; i+=1) {
            for (int j = 0; j < 5; j+=4) {
                design[i][j] = '*';
            }
        }
    }

    void receivePattern(ArrayList<Integer> pattern) {
        //i - row, j - column
        int rowH_begin = pattern.get(0);
        int rowH_end = pattern.get(1);
        int rowH_step = pattern.get(2);

        int columnH_begin = pattern.get(3);
        int columnH_end = pattern.get(4);
        int columnH_step = pattern.get(5);

        int rowV_begin = pattern.get(6);
        int rowV_end = pattern.get(7);
        int rowV_step = pattern.get(8);

        int columnV_begin = pattern.get(9);
        int columnV_end = pattern.get(10);
        int columnV_step = pattern.get(11);

        //Two necessary loops to remove extra lines from default "8" pattern
        for (int i = rowH_begin; i < rowH_end; i+=rowH_step) {
            for (int j = columnH_begin; j < columnH_end; j+=columnH_step) {
                design[i][j] = ' ';
            }
        }

        for (int i = rowV_begin; i < rowV_end; i+=rowV_step) {
            for (int j = columnV_begin; j < columnV_end; j+=columnV_step) {
                design[i][j] = ' ';
            }
        }
    }

    //При ниобходимости отобразить число само по себе
    void printPattern() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(design[i][j]);
            }
            System.out.println();
        }
    }

    int getValue() {
        return this.value;
    }

    char[][] getDesign() {
        return this.design;
    }
}
