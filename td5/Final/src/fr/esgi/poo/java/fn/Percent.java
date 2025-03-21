package fr.esgi.poo.java.fn;

public class Percent {

    private static final int MIN = 0;
    private static final int MAX = 100;
    private int value;

    public Percent(int value) {
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int pValue) {
        this.value = (pValue < 0 && pValue > 100)?0:pValue;
    }

}
