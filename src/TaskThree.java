import java.util.Scanner;

public class TaskThree {
    //TODO: Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side a: ");
        double a = scanner.nextDouble();
        System.out.println("Input side b: ");
        double b = scanner.nextDouble();
        double S = a * b;
        double P = 2 * (a+b);
        System.out.println("Square = " + S);
        System.out.println("Perimeter = " + P);
    }
}
