package ru.stqa.pft.sandbox;

public class Point {

    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Point p1 (double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public Point p2 (double x2, double y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance(Point p1, Point p2){
        double d = Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 * p1.y1));
        return d;
    }


    public String toString1() {

        return this.x1 + ";" + this.y1;

    }


    public String toString2() {

        return this.x2 + ";" + this.y2;

    }
}





/*Правильный метод при реализации из одного класса
public class Point {

    public static double x1, y1, x2, y2;

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x1 = 1;
        p1.y1 = 0;
        p2.x2 = 7;
        p2.y2 = 0;

        System.out.println("Расстояние между точками (" + p1.toString1() + ") и (" + p2.toString2() + ") = " + distance(p1, p2));

    }

    public static double distance(Point p1, Point p2) {

        return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));

    }


    public String toString1() {

        return this.x1 + ";" + this.y1;

    }

    public String toString2() {

        return this.x2 + ";" + this.y2;

    }
}
*/


/*
1. Создать класс ru.stqa.pft.sandbox.Point для представления точек на двумерной плоскости. Объекты этого класса должны содержать два
атрибута, которые соответствуют координатам точки на плоскости.

2. Создать функцию
public static double distance(ru.stqa.pft.sandbox.Point p1, ru.stqa.pft.sandbox.Point p2)
которая вычисляет расстояние между двумя точками. Для вычисления квадратного корня можно использовать функцию Math.sqrt

3. Сделать запускаемый класс, то есть содержащий функцию
public static void main(String[] args) {...}
и при помощи него убедиться, что функция вычисления расстояния между точками действительно работает. Результат
вычисления выводить на экран и контролировать визуально.

4. Реализовать то же самое (вычисление расстояния между двумя точками) при помощи метода в классе ru.stqa.pft.sandbox.Point, и добавить
в созданный в предыдущем пункте запускаемый класс примеры использования метода вместо ранее созданной функции.

 */