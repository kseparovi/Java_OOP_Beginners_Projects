package AreaCalculator;

import static java.lang.Math.PI;
import static java.lang.Math.round;


public class AreaCalculator {
    public static void main(String[] args) {
        area(5.0, 9.0);
        area(16);
    }


    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }
        double circleArea = radius * radius * PI;
        System.out.println(radius + " radius is " + round(circleArea) + " square meters area of circle ");
        return circleArea;

    }

    public static double area(double x, double y) {
        if ((x < 0) && (y < 0)) {
            return -1.0;
        }
        double rectangleArea = x * y;
        System.out.println(x + "  and " + y + " is " + rectangleArea + " area of rectangle.");
        return rectangleArea;


    }
}
