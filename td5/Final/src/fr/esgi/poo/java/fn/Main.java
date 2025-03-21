package fr.esgi.poo.java.fn;

public class Main {
    public static void main(String[] args) {
        int myValue = 4;
        Main main = new Main();
        main.updateInt(myValue);
        System.out.println(myValue);
        System.out.println();

        int newValue = main.updateAndReturnInt(myValue);
        System.out.println(myValue);
        System.out.println(newValue);
        System.out.println();

        Percent percent = new Percent(10);
        main.updatePercent(percent);
        System.out.println(percent.getValue());

        main.updatePercentFinal(percent);
        System.out.println(percent.getValue());
    }


    public void updateInt(int value) {
        value = 2;
    }

    public final void updateIntFinal(final int value) {
        // this.value = 2;
    }

    public int updateAndReturnInt(int value) {
        value = 2;
        return value;
    }

    public void updatePercent(Percent percent) {
        percent.setValue(50);
        percent = new Percent(0);
    }

    public void updatePercentFinal(final Percent percent) {
        percent.setValue(30);
        // percent = new Percent(0);
    }

}
