import java.util.Scanner;

public class ConditionalOperator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");

        System.out.println("Ваша операционная система:\n0.iOS;\n1.Android");
        System.out.print("Выберите свою: ");
        int clientOS = scanner.nextInt();
        switch (clientOS) {
            case 0 -> System.out.println("«Установите версию приложения для iOS по ссылке»");
            case 1 -> System.out.println("«Установите версию приложения для Android по ссылке»");
        }
    }
}