package edu.kielce.lab3;

import java.util.Scanner;

public class PointMain {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(5,5);
        Point point3 = new Point(point1);
        Point point4 = new Point();

        Scanner scanner = new Scanner(System.in);

        point1.coordinateX = 3;
        point1.coordinateY = 3;

        System.out.println("---------------------------------");

        System.out.print("Podaj x = ");
        int x = scanner.nextInt();
        point4.setX(x);

        System.out.print("Podaj y = ");
        int y = scanner.nextInt();
        point4.setY(y);
        point4.printCoordinates();

        System.out.println("---------------------------------");

        System.out.println("Punkt 2 x = " + point2.getX());
        System.out.println("Punkt 2 y = " + point2.getY());

        System.out.println("---------------------------------");
        point1.printCoordinates();
        point2.printCoordinates();
        point3.printCoordinates();
        point4.printCoordinates();

        System.out.println("---------------------------------");

        double distancePoint = point1.distanceFromPoint(point4);
        System.out.println("Odleglosc punktu 1 od 4 = " + distancePoint);

        double distanceCenter = point3.distanceFromCenter();
        System.out.println("Odleglosc punktu 3 od srodka ukladu wspolrzednych = " + distanceCenter);
    }
}
