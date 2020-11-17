package exercise8;

import java.util.Scanner;


public class Point {
    // Define attributes
    double x;
    double y;

    public Point() {
        // Initialize attributes to 0
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        x = otherPoint.x;
        y = otherPoint.y;
    }

    public Scanner initialize() {
        // Change attributes through console
       System.out.print("Enter x: ");
        x = Utils.INPUT.nextDouble();
        System.out.print("Enter y: ");
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        double newX = x + xDelta;
        double newY = y + yDelta;
        return new Point(newX, newY);
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        boolean xEqual = x == otherPoint.x;
        boolean yEqual = y == otherPoint.y;
        return xEqual && yEqual;
    }

    public String toString() {
        // Represent attributes as string

        return "(" + x + ", " + y + ")";
    }
}
