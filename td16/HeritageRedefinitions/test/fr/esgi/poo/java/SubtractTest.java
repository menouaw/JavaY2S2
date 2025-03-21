package fr.esgi.poo.java;

class SubtractTest {
    Subtract comp = new Subtract(2, 5);

    @org.junit.jupiter.api.Test
    public void compute() {
        assert comp.compute() == -3;
    }
}