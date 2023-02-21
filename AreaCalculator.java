import java.util.Scanner;
public class AreaCalculator 
{
    private static double base;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double circleArea = calculateArea1(radius);
        System.out.println("Area of the circle = " + circleArea);
        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        double rectangleArea = calculateArea2(length, width);
        System.out.println("Area of the rectangle = " + rectangleArea);
        // Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();
        double triangleArea = calculateArea3(base, height);
        System.out.println("Area of the triangle = " + triangleArea);
    }
    // Method to calculate the area of a circle
    public static double calculateArea1(double radius) 
    {
        return Math.PI * radius * radius;
    }
    // Method to calculate the area of a rectangle
    public static double calculateArea2(double length, double width) 
    {
        return length * width;
    }
    // Method to calculate the area of a triangle
    public static double calculateArea3(double base, double height) 
    {
        AreaCalculator.base = base;
        return 0.5 * base * height;
    }
}
