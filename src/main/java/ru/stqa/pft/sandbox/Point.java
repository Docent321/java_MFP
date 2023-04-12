package ru.stqa.pft.sandbox;

public class Point {

    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Point p1 (double xx1, double yy1) {
        x1 = xx1;
        y1 = yy1;
        return null;
    }

    public Point p2 (double xx2, double yy2) {
        x2 = xx2;
        y2 = yy2;
        return null;
    }

    public double distance(){
        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return d;
    }

}



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