public class lab1
{
    public static void main(String[] args) 
        {
            //Example 1
            System.out.println("Hello, I am Aloy!");

            //Example 2
            String module = "CSC1009";
            switch(module)
            {
                case "CSC1006":
                    System.out.println("Math 2");
                    break;
                case "CSC1007":
                    System.out.println("Operating systems");
                case "CSC 1008":
                    System.out.println("Data structures");
                case "CSC1009":
                    System.out.println("Object-Oriented Programming");
            }

            //Example 3
            int x = 102;
            while (x != 65)
            {
                System.out.println(x);
                x -= 1;
            }
        }
}