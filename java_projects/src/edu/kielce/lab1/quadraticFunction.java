package edu.kielce.lab1;
import java.util.Scanner;

public class quadraticFunction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = in.nextInt();
        System.out.print("Podaj b: ");
        int b = in.nextInt();
        System.out.print("Podaj c: ");
        int c = in.nextInt();

        double x1, x2;

        double delta = Math.pow(b, 2.0) - (4 * a * c);

        if (delta < 0) {
            System.out.print("Delta ujemna, brak rozwiazan");
        } else if (delta == 0) {
            x1 = (-b) / 2 * a;
            System.out.print("Miejsce zerowe funkcji: " + x1);
        } else {
            x1 = (-b - Math.sqrt(delta)) / 2 * a;
            x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.print("Miejsca zerowe funkcji to x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
