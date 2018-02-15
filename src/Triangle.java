
public class Triangle {

    private double[] sides;


    public Triangle(double a, double b, double c) {
        double[] array = new double[]{a, b, c};
        sides = array;
    }

    public boolean AmITriangle() {
        double[] s = sides;
        return s[0] + s[1] > s[2] && s[0] + s[2] > s[1] && s[1] + s[2] > s[0] && s[0] > 0 && s[1] > 0 && s[2] > 0;
    }

    public TriangleType CalculateTriangleType() {

        if (!AmITriangle()) {
            return TriangleType.Error;
        }
        if (AmIEquilateral()) {
            return TriangleType.Equilateral;
        }
        if (AmIIsoceles()) {
            return TriangleType.Isoceles;
        }
        return TriangleType.Scalene;

    }

    private boolean AmIIsoceles() {
        return sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2];
    }

    private boolean AmIEquilateral() {
        return sides[0] == sides[1] && sides[1] == sides[2];
    }


    public enum TriangleType {
        Error,
        Equilateral,
        Isoceles,
        Scalene

    }

    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
        if (!AmITriangle()) {
            throw new IllegalArgumentException("Hey!!!, invalid sides for a triangle. Cannot make up a triangle!");
        }
    }
}