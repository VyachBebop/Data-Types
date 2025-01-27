import java.util.Scanner;

public class TaskFour {
    //TODO:	Дан диаметр окружности d. Найти ее длину L=π∗d. В качестве значения π использовать константу 3.14.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input diameter of a circle: ");
        int d = scanner.nextInt();
        double L = 3.14 * d;
        System.out.println("Circle length = " + L);
    }
}