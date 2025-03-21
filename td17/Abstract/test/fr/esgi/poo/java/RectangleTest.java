package fr.esgi.poo.java;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rect = new Rectangle();

    @org.junit.jupiter.api.Test
    void draw() {
        assertEquals("Drawing a rectangle", rect.draw());
    }
}