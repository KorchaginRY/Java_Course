
/**
 * Написать программу вычисления n-ого треугольного числа
 */
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение a = ");
        int a = iScanner.nextInt();
        double sum = (a * (a + 1)) / 2;
        int n = (int) sum;
        System.out.println(n);
        iScanner.close();   
    }
}

