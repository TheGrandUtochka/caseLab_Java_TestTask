package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите значения перменных a и b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("До свапа: a = " + a + " b = " + b);

        int[] swappedValues = valueSwap(a, b);
        a = swappedValues[0];
        b = swappedValues[1];

        System.out.println("После свапа: a = " + a + " b = " + b);
    }

    static int[] valueSwap(int a, int b) {
        b = a + b - (a = b);
        return new int[]{a, b};
    }
}