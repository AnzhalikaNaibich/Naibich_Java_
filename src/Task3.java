import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        double[] array = new double[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }

        for (double el : array) {
            if (el % 3 == 0) {
                System.out.println(el + " ");
            }
        }
    }
}
