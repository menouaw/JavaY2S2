package fr.esgi.poo.java.mc;

public class Launcher {
    public static void main(String[] args) {

        Integer x = Integer.valueOf(args[0]);
        Integer y = Integer.valueOf(args[1]);
        Integer z = Integer.valueOf(args[2]);


        Point firstPoint = new Point(x, y, z);
        Point secondPoint = new Point();
        Point thirdPoint = new Point(x);
        Point fourthPoint = new Point(x, -1);

        Point[] points = {firstPoint, secondPoint, thirdPoint, fourthPoint};
        for (Point point : points) {
            point.displayPoint();
            //point.toString();
        }
    }
}
