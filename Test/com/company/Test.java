package com.company;

import org.junit.Assert;
import org.junit.Before;

public class Test {
    Main main;
    Points left_top_one;
    Points right_bottom_one;
    Points left_top_two;
    Points right_bottom_two;

    @Before
    public void setup() {
        main = new Main();
        left_top_one = new Points();
        right_bottom_one = new Points();
        left_top_two = new Points();
        right_bottom_two = new Points();
    }

    @org.junit.Test
    public void testCaseNonOverlap() {
        left_top_one.setX(0);
        left_top_one.setY(3);
        right_bottom_one.setX(4);
        right_bottom_two.setY(0);
        left_top_two.setX(7);
        left_top_two.setY(5);
        right_bottom_two.setX(10);
        right_bottom_two.setY(6);
        Assert.assertEquals(Main.willItOverlap(left_top_one, right_bottom_one, left_top_two, right_bottom_two), false);

    }

    @org.junit.Test
    public void testCaseOverlap() {
        left_top_one.setX(0);
        left_top_one.setY(3);
        right_bottom_one.setX(4);
        right_bottom_two.setY(0);
        left_top_two.setX(2);
        left_top_two.setY(2);
        right_bottom_two.setX(10);
        right_bottom_two.setY(6);
        Assert.assertEquals(Main.willItOverlap(left_top_one, right_bottom_one, left_top_two, right_bottom_two), true);

    }

}
