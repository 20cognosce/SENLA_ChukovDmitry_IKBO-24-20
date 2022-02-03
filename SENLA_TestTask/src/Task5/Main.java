package Task5;

/**
@author Chukov Dmitry. RTU MIREA 2021
 */

public class Main {
    public static void main(String[] args) {
        Safe mySafe = new Safe(1000);
        SafeFiller safeFiller = new SafeFiller();

        safeFiller.createSetOfItems();
        safeFiller.sortItems();
        safeFiller.fillTheSafe(mySafe);

        System.out.println(mySafe.getContent());
    }
}
