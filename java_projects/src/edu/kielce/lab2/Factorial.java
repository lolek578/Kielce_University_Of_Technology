package edu.kielce.lab2;

public class Factorial {

    static int factorialWhile(int n){
        int factorial = 1;
        int i = 0;

        while(i != n){
            i++;
            factorial *=i;
        }
    return factorial;
    }

    static int factorialDoWhile(int n){
        int factorial = 1;
        int i = 0;

        do{
            i++;
            factorial *= i;
        }while(i != n);

        return factorial;
    }

    static int factorialFor(int n){
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }


    public static void main(String args[]){
        System.out.println("While = " + factorialWhile(5));
        System.out.println("Do while =  " + factorialDoWhile(6));
        System.out.println("For = " + factorialFor(7));
    }
}
