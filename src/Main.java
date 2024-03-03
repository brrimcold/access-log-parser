import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber+secondNumber;
        int diff = firstNumber-secondNumber;
        int product = firstNumber*secondNumber;
        double quotient = (double)firstNumber/secondNumber;
        System.out.println("Сумма чисел равна: "+sum);
        System.out.println("Разность чисел равна: "+diff);
        System.out.println("Произведение чисел равна: "+product);
        System.out.println("Разность чисел равна: "+quotient);
    }
}