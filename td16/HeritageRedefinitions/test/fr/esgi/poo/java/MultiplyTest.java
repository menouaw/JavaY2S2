package fr.esgi.poo.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    Multiply comp = new Multiply(2, 5);

    @Test
    public void compute() {
        assert comp.compute() == 10;
    }
}