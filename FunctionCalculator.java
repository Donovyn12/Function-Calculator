import java.util.Scanner;

public class FunctionCalculator
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am here to help you find the volume of a rectangular cube. ");
        System.out.println("All you have to do is enter the length, width, and height (with spaces between). ");
        System.out.println("*This calculator will round to the nearest whole number. ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = length * 2 + width * 2 + height * 2;
        int answer = (int) (volume + 0.5);
        System.out.print("The volume of this shape is " + answer + " units cubed. ");
        
        
    }
}