import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {


    @Test
    public void calculateTriangleType1() {
        Triangle t = new Triangle(1, 1, 1);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());
    }

    @Test
    public void calculateTriangleType2() {
        Triangle t = new Triangle(4, 4, 4);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());
    }

    @Test (expected = IllegalArgumentException.class)
    public void calculateTriangleType3() {
        Triangle t = new Triangle(4, 1, 1);
        t.CalculateTriangleType();
    }

    @Test
    public void calculateTriangleType5() {
        Triangle t = new Triangle(1000, 1000, 1000);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());
    }
    @Test (expected = IllegalArgumentException.class)
    public void calculateTriangleType6() {
        Triangle t = new Triangle(0, 1, 1);
         t.CalculateTriangleType();
    }
    @Test (expected = IllegalArgumentException.class)
    public void calculateTriangleType7() {
        Triangle t = new Triangle(3, -3, 3);
        t.CalculateTriangleType();
    }

    @Test (expected = IllegalArgumentException.class)
    public void calculateTriangleType8() {
        Triangle t = new Triangle(3, 2, 1);
        t.CalculateTriangleType();
    }
    @Test (expected = IllegalArgumentException.class)
    public void calculateTriangleType9() {
        Triangle t = new Triangle(3, -3, 3);
        t.CalculateTriangleType();
    }
    @Test
    public void calculateTriangleType10() {
        Triangle t = new Triangle(1.5, 3.8, 2.5);
        assertEquals(Triangle.TriangleType.Scalene, t.CalculateTriangleType());
    }
    @Test
    public void calculateTriangleType11() {
        Triangle t = new Triangle(67, 67, 32);
        assertEquals(Triangle.TriangleType.Isoceles, t.CalculateTriangleType());
    }
    @Test
    public void calculateTriangleType12() {
        Triangle t = new Triangle(2012, 2012, 2012);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());
    }



}