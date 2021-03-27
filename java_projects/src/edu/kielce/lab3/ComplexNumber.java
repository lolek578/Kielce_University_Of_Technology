package edu.kielce.lab3;

public class ComplexNumber {

    int re, im;

    ComplexNumber(){
        re = 2;
        im = 3;
    }

    ComplexNumber(int x){
        re = x;
        im = x;
    }

    ComplexNumber(int re, int im){
        this.re = re;
        this.im = im;
    }

    void setRe(int re) {
        this.re = re;
    }

    void setIm(int im) {
        this.im = im;
    }

    int getIm(){
        return im;
    }

    int getRe(){
        return re;
    }

    void printComplexNumber(){
        System.out.println("Liczba zespolona = " + getRe() + " + " +getIm() + "i");
    }

    double modulusOfComplexNumber() {
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    double complexNumberAngle(){
        return Math.toDegrees(Math.atan(im / re));
    }

}
