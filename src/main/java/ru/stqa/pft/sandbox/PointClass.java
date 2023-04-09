package ru.stqa.pft.sandbox;



public class PointClass {

    public static void main(String[] args) {
        Point p1 = new Point().p1(5, 6);
        Point p2 = new Point().p2(8, 10);


        System.out.println("Расстояние между точками (" + p1.toString1() + ") и (" +p2.toString2() + ") = " + distance(p1, p2));
   }
}
