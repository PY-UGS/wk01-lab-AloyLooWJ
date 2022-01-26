import java.util.Scanner;

public class Q1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();
        input.close();
        double PI = 3.14159;
        double area = radius * radius * PI;
        System.out.print("The area for the circle of radius " + radius + " is " + area);
    }
}