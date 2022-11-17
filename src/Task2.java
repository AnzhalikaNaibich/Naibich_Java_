import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
