package Task5;

public class Item {
    int value;
    int volume;
    double valueQuotient; //describes the relative value of the current item comparing to its volume

    Item(int value, int volume) {
        this.value = value;
        this.volume = volume;
        this.valueQuotient = (double)this.value / this.volume;
    }

    int getValue() {
        return this.value;
    }

    int getVolume() {
        return this.volume;
    }

    double getValueQuotient() {
        return this.valueQuotient;
    }

    @Override
    public String toString() {
        return (this.getValue() + " " + this.getVolume() + " " + this.getValueQuotient());
    }
}
