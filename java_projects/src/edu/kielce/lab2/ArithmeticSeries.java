package edu.kielce.lab2;
import java.util.Scanner;

public class ArithmeticSeries {

    static double arithmeticWhile(double start, double end, double difference) {
        double count = start;

        while (start != end) {
            start += difference;
            count += start;
        }
        return count;
    }

    static double arithmeticDoWhile(double start, double end, double difference){
        double count = start;

        do{
            start += difference;
            count += start;
        }while(start != end);

        return count;
    }

    static double arithmeticFor(double start, double end, double difference){
        double count = 0;

        for(double i = start; i <= end; i += difference){
            count += i;
        }
    return count;
    }



    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Start:  ");
        double start = in.nextDouble();
        System.out.print("End: ");
        double end = in.nextDouble();
        System.out.print("Difference: ");
        double difference = in.nextDouble();

        System.out.println("While loop: " + arithmeticWhile(start, end, difference));
        System.out.println("Do While loop: " + arithmeticDoWhile(start, end, difference));
        System.out.println("For loop: " + arithmeticFor(start, end, difference));
    }
}
