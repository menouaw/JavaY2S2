package fr.esgi.poo.java;

import org.junit.jupiter.api.Test;


class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void add() {
        assert calc.add(5, 2) == 7;
        assert calc.add(5, 2, 3) == 10;
        assert calc.add(0, 0, 0) == 0;
        assert calc.add(5, -1) == 4;
    }
}