import java.util.Scanner;

public class TaskSix {
    //TODO: Даны целые положительные числа A и B (A>B).
    // На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    // Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A: ");
        int a = scanner.nextInt();
        System.out.println("Input B: ");
        int b = scanner.nextInt();
        int c = a/b;
        System.out.println("The number of segments B placed on segment A is equal to: " + c);
    }
}
