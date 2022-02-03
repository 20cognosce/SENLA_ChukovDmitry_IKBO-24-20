package Task5;

import java.util.ArrayList;

public class Safe {
    final int capacity;
    ArrayList<Item> content = new ArrayList<>();

    Safe(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getContentVolume() {
        int sum = 0;
        for (Item item: this.content) {
            sum += item.getVolume();
        }
        return sum;
    }

    public void addItem(Item item) {
        this.content.add(item);
    }

    public String getContent() {
        StringBuilder stringContent = new StringBuilder();
        stringContent.append("Value Volume ValueQuotient\n");
        for (Item item: this.content) {
            stringContent.append(item.toString()).append("\n");
        }
        return stringContent.toString();
    }
}
