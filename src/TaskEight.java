import java.util.Scanner;

public class TaskEight {
    //TODO: Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A: ");
        int a = scanner.nextInt();
        System.out.println("Input B: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int sqr = (a*a)/(b*b);
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + dif);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a*a + " / " + b*b + " = " + sqr);
    }
}