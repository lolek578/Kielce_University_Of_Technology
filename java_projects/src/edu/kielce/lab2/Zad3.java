package edu.kielce.lab2;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj czas do startu rakiety = ");
        int n = scanner.nextInt();

        for (int i = n; i >= 0; i--) {
            switch(i) {
                case 0:
                    System.out.println("Start!");
                    break;
                case 1:
                    System.out.println("jeden");
                    break;

                case 2:
                    System.out.println("dwa");
                    break;

                case 3:
                    System.out.println("trzy");
                    break;

                case 4:
                    System.out.println("cztery");
                    break;

                case 5:
                    System.out.println("piec");
                    break;
            }
        }
    }
}
