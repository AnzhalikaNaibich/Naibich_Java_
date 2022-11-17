import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner digit = new Scanner(System.in);
        try {
            double unknownDigit = digit.nextDouble();
            if (unknownDigit > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных");
        }

    }
}