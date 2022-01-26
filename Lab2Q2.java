import java.util.Scanner;

public class Lab2Q2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double[] numbers = new double[3];
        for (int i = 0; i < 3; i++)
        {
            numbers[i] = input.nextDouble();
        }
        input.close();
        double average = (numbers[0] + numbers[1] + numbers[2]) / 3;
        System.out.print("The average of " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " is " + average);
    }
}
