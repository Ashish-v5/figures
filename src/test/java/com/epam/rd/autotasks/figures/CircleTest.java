package com.epam.rd.autotasks.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CircleTest {

    @Test
    void testConstructor() {
        Figure circle = null;
        circle = new Circle(new Point(0, 0), 1);
        circle = new Circle(new Point(1, 3), 1);
        circle = new Circle(new Point(-23.5, 236), 56);
        circle = new Circle(new Point(-28.5, -2), 0.001);
        circle = new Circle(new Point(56, -87), 11.1235);

        assertNotNull(circle);
    }

    @Test
    void testArea() {
        assertEquals(3.14159265358979323846, new Circle(new Point(0, 0), 1).area(), 0.0001);
        assertEquals(3.14159265358979323846, new Circle(new Point(1, 3), 1).area(), 0.0001);
        assertEquals(9852.03456165759, new Circle(new Point(-23.5, 236), 56).area(), 0.0001);
        assertEquals(0.00000314159265358979323846, new Circle(new Point(-28.5, -2), 0.001).area(), 0.0001);
        assertEquals(388.71633468071917, new Circle(new Point(56, -87), 11.1235).area(), 0.0001);
    }

    @Test
    void testPointsToString() {
        assertEquals("(0.0,0.0)", new Circle(new Point(0, 0), 1).pointsToString());
        assertEquals("(1.0,3.0)", new Circle(new Point(1, 3), 1).pointsToString());
        assertEquals("(-23.5,236.0)", new Circle(new Point(-23.5, 236), 56).pointsToString());
        assertEquals("(-28.5,-2.0)", new Circle(new Point(-28.5, -2), 0.001).pointsToString());
        assertEquals("(56.0,-87.0)", new Circle(new Point(56, -87), 11.1235).pointsToString());
    }

    @Test
    void testToString() {
        assertEquals("Circle[(0.0,0.0)1.0]", new Circle(new Point(0, 0), 1).toString());
        assertEquals("Circle[(1.0,3.0)1.0]", new Circle(new Point(1, 3), 1).toString());
        assertEquals("Circle[(-23.5,236.0)56.0]", new Circle(new Point(-23.5, 236), 56).toString());
        assertEquals("Circle[(-28.5,-2.0)0.001]", new Circle(new Point(-28.5, -2), 0.001).toString());
        assertEquals("Circle[(56.0,-87.0)11.1235]", new Circle(new Point(56, -87), 11.1235).toString());
    }

}
