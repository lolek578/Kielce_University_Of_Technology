package edu.kielce.lab3;

public class Point {
    int coordinateX;
    int coordinateY;

    Point(){
        coordinateX = 2;
        coordinateY = 2;
    };

    Point(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    Point(Point point){
        coordinateX = point.coordinateX;
        coordinateY = point.coordinateY;
    }


    void setX(int x) {
        this.coordinateX = x;
    }

    void setY(int y){
        this.coordinateY = y;
    }

    int getX(){
        return coordinateX;
    }

    int getY(){
        return coordinateY;
    }

    void printCoordinates(){
        System.out.println("x = " + coordinateX + "\t y = " + coordinateY);
    }

    double distanceFromPoint(Point point){
        double distance = Math.sqrt(Math.pow(coordinateX - point.coordinateX, 2) +
                                    Math.pow(coordinateY - point.coordinateY, 2));

        return distance;
    }
    double distanceFromCenter(){
        double distance = Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY,2 ));
        return distance;
    }
}
