package ru.stqa.pft.sandbox;



public class PointClass {

    public static void main(String[] args) {
        double x1 = 5;
        double y1 = 0;
        double x2 = 8;
        double y2 = 0;

        Point q = new Point();

        q.p1(x1, y1);
        q.p2(x2, y2);

        System.out.println("Расстояние между точками p1(" + x1 + ";" + y1 + ") и точкой p2("  + x2 +  ";"  + y2 + ") = " + q.distance());
    }
}
