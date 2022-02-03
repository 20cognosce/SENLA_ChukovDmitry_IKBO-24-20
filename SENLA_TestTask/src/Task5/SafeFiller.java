package Task5;
import java.util.ArrayList;

/******************** Using slightly modified greedy algorithm ********************/
//Задача очень похожа на классическую задачу о размене монеты. Используя жадный алгоритм, я осознаю что решение может
//не быть самым оптимальным в действительности, но оно к нему стремится и при этом является относительно простым.

public class SafeFiller {
    ArrayList<Item> setOfItems = new ArrayList<>();

    void createSetOfItems(){
        this.setOfItems.add(new Item(1500, 100));
        this.setOfItems.add(new Item(10000, 50));
        this.setOfItems.add(new Item(25000, 500));
        this.setOfItems.add(new Item(1000, 10));
        this.setOfItems.add(new Item(50000, 800));
        this.setOfItems.add(new Item(3000, 50));
        this.setOfItems.add(new Item(6000, 60));
        this.setOfItems.add(new Item(7500, 150));
        this.setOfItems.add(new Item(500, 200));
        this.setOfItems.add(new Item(12000, 200));
    }

    void sortItems() {
        setOfItems.sort((Item a, Item b) -> -Double.compare(a.getValueQuotient(),b.getValueQuotient()));
        //Descending order
    }

    void fillTheSafe(Safe safe) {
        for (Item item: setOfItems) {
            if (safe.getContentVolume() + item.getVolume() <= safe.getCapacity()) {
                safe.addItem(item);
            }
        }
    }
}
