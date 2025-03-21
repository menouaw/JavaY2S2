package fr.esgi.poo.java.sample;

public class MySample {
    public static final double PI = 3.14159;
    public Integer myNumber;
    private boolean isOK;
    int myInt; // 0

    public MySample(int anInt) {
        this.myNumber = anInt;
    }

    public boolean isOK() {
        return isOK;
    }

    public void setOK(boolean OK) {
        isOK = OK;
    }
}
