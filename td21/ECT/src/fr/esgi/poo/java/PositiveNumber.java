package fr.esgi.poo.java;

public class PositiveNumber {
    private int value;

    public void setValue(int v) throws NotPositiveNumberException {
        if (v > 0) {
            this.value = v;
        } else {
            throw new NotPositiveNumberException("Valeur inférieure à 0.");
        }
    }
}
