package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistanceOnePoint00(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(8,0);

        Assert.assertEquals(p1.distance(p2),8.0);
    }

    @Test
    public void testDistancePointsIsNot00(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,8);

        Assert.assertEquals(p1.distance(p2),7.0);
    }

    @Test
    public void testDistanceTwoPointsTheSame(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,1);

        Assert.assertEquals(p1.distance(p2),0.0);
    }

}
