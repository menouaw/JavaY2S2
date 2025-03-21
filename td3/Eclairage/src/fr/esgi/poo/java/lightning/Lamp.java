package fr.esgi.poo.java.lightning;

public class Lamp {
    public static final Integer LEVEL_MIN = 0;
    public static final Integer LEVEL_MAX = 9;

    private boolean isOn;
    private int level;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
        if(isOn)level = LEVEL_MAX;
    }

    public Lamp(int newLevel) {
        switchOn(newLevel);
    }

    public void switchOn() {
        switchOn(LEVEL_MAX);
    }

    public void switchOn(int newLevel) {
        if (newLevel>=LEVEL_MAX&&newLevel<=LEVEL_MAX) {
            level = newLevel;
            isOn = (level>LEVEL_MIN);
        }
    }

    public void switchOff() {
        isOn = false;
        level = LEVEL_MIN;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "isOn=" + isOn +
                ", level=" + level +
                '}';
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
