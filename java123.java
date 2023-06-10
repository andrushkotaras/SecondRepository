import java.util.Scanner;

public class java123 {
    public static void main(String[] args) {
        // Частина 1
        System.out.print("Програма для знаходження більшого з двох чисел. Введіть перше число: ");
        Scanner n1 = new Scanner(System.in);
        int number1 = n1.nextInt();

        System.out.print("Введіть друге число: ");
        Scanner n2 = new Scanner(System.in);
        int number2 = n2.nextInt();

        if (number1 > number2) {
            System.out.println("Перше число більше");
        } else if (number2 > number1) {
            System.out.println("Друге число більше");
        } else {
            System.out.println("Числа рівні");
        }

        // Частина 2
        System.out.print("Програма для знаходження меншого з двох чисел. Введіть перше число: ");
        Scanner n3 = new Scanner(System.in);
        int number3 = n3.nextInt();

        System.out.print("Введіть друге число: ");
        Scanner n4 = new Scanner(System.in);
        int number4 = n4.nextInt();

        if (number3 < number4) {
            System.out.println("Перше число менше");
        } else if (number4 < number3) {
            System.out.println("Друге число менше");
        } else {
            System.out.println("Числа рівні");
        }

        // Частина 3
        System.out.print("Програма для визначення парності числа. Введіть число: ");
        Scanner n5 = new Scanner(System.in);
        int number5 = n5.nextInt();

        if (number5 % 2 == 0){
            System.out.println("Число парне");
        }
        else {
            System.out.println("Число не парне");
        }

    }
}
