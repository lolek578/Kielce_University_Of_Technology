package edu.kielce.lab2;
import java.util.Scanner;

public class Zad2 {
    static public void main(String args[]){

        int counter = 0;
        double sum = 0;
        double term;
        boolean end = true;

        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Term = ");
            term = in.nextDouble();
            sum += term;
            counter++;
        }while(term != -111);

        System.out.println("Average= " + (sum/counter));

    }
}
