import java.util.Scanner;

public class ConditionalOperator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");

        System.out.println("Ваша операционная система на смартфоне:\n0.iOS;\n1.Android");
        System.out.print("Выберите свою введите 0 или 1: ");
        int clientOS = scanner.nextInt();
        String action = "";
        switch (clientOS) {
            case 0 -> {
                System.out.println("«Установите версию приложения для iOS по ссылке»");
                action = "iOS";
            }
            case 1 -> {
                System.out.println("«Установите версию приложения для Android по ссылке»");
                action = "Android";

            }
        }
        System.out.println();
        System.out.println("Задача 2");
        System.out.print("Введите год производства вашего смартфона: ");
        int clientDeviceYear = scanner.nextInt();

        if (clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для " + action + " по ссылке».");
        } else {
            System.out.println("Ссылка на скачивание приложения для " + action);
        }

        System.out.println("Задача 3");
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}