import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1(); // если введенное число больше 7, то вывести “Привет”
        task2(); // если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        task3(); // на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    }
    public static void task1() {
        System.out.println("Введите число: ");
        Scanner digit = new Scanner(System.in);
        int a = digit.nextInt();
        if(a > 7) {
            System.out.println("Привет");
        }
    }

    public static void task2() {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }

    public static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

