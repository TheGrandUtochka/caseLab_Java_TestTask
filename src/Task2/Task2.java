package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите значения переменных a и b: ");
                a = sc.nextInt();
                b = sc.nextInt();

                System.out.println("До свапа: a = " + a + " b = " + b);

                int[] swappedValues = valueSwap(a, b);
                a = swappedValues[0];
                b = swappedValues[1];

                System.out.println("После свапа: a = " + a + " b = " + b);

                break;
            } catch (InputMismatchException e) {
                System.out.println("Ну вот ни стыда, ни совести! Нужно ввести целочисленные значения a и b! Например [-2, 5], [3, 2] и т.д..");
                sc.nextLine();
            }
        }
        sc.close();
    }

    static int[] valueSwap(int a, int b) {
        b = a + b - (a = b);
        return new int[]{a, b};
    }
}
