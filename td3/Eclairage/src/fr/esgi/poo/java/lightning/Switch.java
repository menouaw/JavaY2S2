package fr.esgi.poo.java.lightning;

public class Switch {
    private Lamp lamp1;
    private Lamp lamp2;

    public Switch(Lamp lamp1, Lamp lamp2) {
        this.lamp1 = lamp1;
        this.lamp2 = lamp2;
    }

    public void switchOnLamp1() {
        lamp1.switchOn();
    }

    public void switchOnLamp2(int newLevel) {
        lamp2.switchOn(newLevel);
    }

    public void switchOn(Lamp myLamp, int myLevel) {
        myLamp.switchOn(myLevel);
    }

    public void switchOff() {
        Lamp[] lamps = {lamp1, lamp2};
        for (Lamp lamp : lamps) {
            lamp.switchOff();
        }
    }

    public void toggle(Lamp lamp1, Lamp lamp2) {
        lamp1.setOn(!(lamp1.isOn()));
        lamp2.setOn(!(lamp2.isOn()));
    }
}
