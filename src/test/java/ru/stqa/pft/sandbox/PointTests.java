package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistanceOnePoint00(){
        Point q = new Point();
        q.p1(0, 0);
        q.p2(8, 0);
        Assert.assertEquals(q.distance(),8.0);
    }

    @Test
    public void testDistancePointsIsNot00(){
        Point q = new Point();
        q.p1(1, 1);
        q.p2(1, 8);
        Assert.assertEquals(q.distance(),7.0);
    }

    @Test
    public void testDistanceTwoPointsTheSame(){
        Point q = new Point();
        q.p1(1, 1);
        q.p2(1, 1);
        Assert.assertEquals(q.distance(),0.0);
    }

}
