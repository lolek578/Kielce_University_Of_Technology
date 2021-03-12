package edu.kielce.lab2;
import java.util.Scanner;

public class GeometricSeries {

    static double geometricWhile(double start, double end, double quotient) {
        double count = start;

        while (start != end) {
            start *= quotient;
            count += start;
        }
        return count;
    }

    static double geometricDoWhile(double start, double end, double quotient) {
        double count = start;

        do {
            start *= quotient;
            count += start;
        } while (start != end);

        return count;
    }

    static double geometricFor(double start, double end, double quotient) {
        double term = start;
        double sum = 0;

        if (start < end) {
            for (double i = term; i <= end; i *= quotient) {
                if (Math.abs(i) > end) {
                    break;
                }
                term += sum;
                sum += i;
            }
        }
        else{
            for(double i = term; end <= i; i*= quotient){
                if(i > Math.abs(end)){
                    break;
                }
                term += sum;
                sum += i;
                }
            }
        return sum;
    }

        public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Start:  ");
        double start = in.nextDouble();
        System.out.print("End: ");
        double end = in.nextDouble();
        System.out.print("Quotient: ");
        double quotient = in.nextDouble();

        System.out.println("While loop: " + geometricWhile(start, end, quotient));
        System.out.println("Do While loop: " + geometricDoWhile(start, end, quotient));
        System.out.println("For loop: " + geometricFor(start, end, quotient));

        }
    }
