package fr.esgi.poo.java;

class SumTest {
    Sum comp = new Sum(2, 5);

    @org.junit.jupiter.api.Test
    public void compute() {
        assert comp.compute() == 7;
    }
}