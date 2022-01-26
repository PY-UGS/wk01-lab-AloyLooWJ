import java.util.Scanner;

public class Lab2Q4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.close();
        int modYear = year % 12;
        if (modYear == 0)
        {
            System.out.print("monkey");
        }
        else if (modYear == 1)
        {
            System.out.print("rooster");
        }
        else if (modYear == 2)
        {
            System.out.print("dog");
        }
        else if (modYear == 3)
        {
            System.out.print("pig");
        }
        else if (modYear == 4)
        {
            System.out.print("rat");
        }
        else if (modYear == 5)
        {
            System.out.print("ox");
        }
        else if (modYear == 6)
        {
            System.out.print("tiger");
        }
        else if (modYear == 7)
        {
            System.out.print("rabbit");
        }
        else if (modYear == 8)
        {
            System.out.print("dragon");
        }
        else if (modYear == 9)
        {
            System.out.print("snake");
        }
        else if (modYear == 10)
        {
            System.out.print("horse");
        }
        else if (modYear == 11)
        {
            System.out.print("sheep");
        }
    }
}
