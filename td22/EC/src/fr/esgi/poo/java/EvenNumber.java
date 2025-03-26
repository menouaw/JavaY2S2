package fr.esgi.poo.java;

public class EvenNumber {
    private int value;

    public EvenNumber(int value) throws NotEvenNumberException {
        this.value = checkValue(value);
    }

    public EvenNumber(int value, boolean check) {
        this.value = checkValueRE(value);
    }

    public int getValue() {
        return value;
    }

    public int checkValue(int value) throws NotEvenNumberException {
        if (value % 2 != 0) {
            throw new NotEvenNumberException("Nombre impair.");
        }
        return value;
    }

    public int checkValueRE(int value) {
        if (value % 2 != 0) {
            throw new RuntimeException("Nombre impair.");
        }
        return value;
    }
}
