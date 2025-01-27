import java.util.Scanner;

public class TaskFive {
    //TODO: Дано расстояние L в сантиметрах. Используя операцию деления нацело,
    // найти количество полных метров в нем (1 метр = 100 см).
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in centimeters: ");
        int L = scanner.nextInt();
        int S = L / 100;
        System.out.println("Number of full meters = " + S);
    }
}
