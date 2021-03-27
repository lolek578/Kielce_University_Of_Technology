package edu.kielce.lab3;

public class ComplexNumberMain {

    public static void main(String[] args) {

        ComplexNumber number1 = new ComplexNumber();
        ComplexNumber number2 = new ComplexNumber(5);
        ComplexNumber number3 = new ComplexNumber(4,4);

        number1.printComplexNumber();
        number2.printComplexNumber();
        number3.printComplexNumber();

        System.out.println("------------");

        System.out.println("Moduł 1 liczby zespolonej = " + number1.modulusOfComplexNumber());
        System.out.println("Moduł 2 liczby zespolonej = " + number2.modulusOfComplexNumber());
        System.out.println("Moduł 3 liczby zespolonej = " + number3.modulusOfComplexNumber());

        System.out.println("------------");

        System.out.println("Argument liczby zespolonej 3 = " + number3.complexNumberAngle());

    }
}
