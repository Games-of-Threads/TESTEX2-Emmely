import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {


    @Test
    public void calculateTriangleType() {
        Triangle t = new Triangle(1, 1, 1);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());
    }

    @Test
    public void calculateTriangleType2() {

        Triangle t = new Triangle(4, 4, 4);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());
    }

    @Test
    public void calculateTriangleType3() {

        Triangle t = new Triangle(4, 1, 4);
        assertEquals(Triangle.TriangleType.Isoceles, t.CalculateTriangleType());
    }

    @Test
    public void calculateTriangleType4() {

        Triangle t = new Triangle(1, 3, 3);
        assertEquals(Triangle.TriangleType.Isoceles, t.CalculateTriangleType());
    }

    @Test
    public void calculateTriangleType5() {

        Triangle t = new Triangle(1000, 1000, 1000);
        assertEquals(Triangle.TriangleType.Equilateral, t.CalculateTriangleType());

    }



}