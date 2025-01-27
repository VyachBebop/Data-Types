import java.util.Scanner;

public class TaskTwo {
    //TODO: Дана сторона квадрата a. Найти его площадь S=a2.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side a: ");
        double a = scanner.nextDouble();
        double S = a * a;
        System.out.println("Square = " + S);
    }
}
