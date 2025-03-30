
package shapecalculator;


public class ShapeCalculator 
{
public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double circleRadius) {
        // Use the formula: Area = pi * radius^2
        double pi = 3.14159265359; // Approximate value of pi
        double area = pi * circleRadius * circleRadius;
        return area;
    }
    
    
    public static void main(String[] args) 
    {
       // Example 1: Calculate the area of a square
        double squareSideLength = 4.0;
        double squareArea = calculateSquareArea(squareSideLength);
        System.out.println("Area of the square with side length " + squareSideLength + ": " + squareArea);

        // Example 2: Calculate the area of a rectangle
        double rectangleLength = 6.0;
        double rectangleWidth = 5.0;
        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle with length " + rectangleLength + " and width " + rectangleWidth + ": " + rectangleArea);

        // Example 3: Calculate the area of a circle
        double circleRadius = 5.0;
        double circleArea = calculateCircleArea(circleRadius);
        System.out.println("Area of the circle with radius " + circleRadius + ": " + circleArea);
    }
    
}
