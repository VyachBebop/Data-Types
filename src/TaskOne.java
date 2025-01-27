import java.util.Scanner;

public class TaskOne {
    //TODO:	Дана сторона квадрата a. Найти его периметр P=4∗a.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side a: ");
        double a = scanner.nextDouble();
        double P = a * 4;
        System.out.println("Perimeter = " + P);
    }
}
