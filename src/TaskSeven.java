import java.util.Scanner;

public class TaskSeven {
    //TODO: Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: A");
        int a = scanner.nextInt();
        if (a>0)
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("The number is negative");
        }
    }
}
