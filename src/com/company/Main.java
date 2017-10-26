package com.company;

public class Main {
    //Two rectangles. If they overlap or not
    public static void main(String[] args) {
	// write your code here

    }
    public static boolean willItOverlap(Points left_top_1, Points right_bottom_1, Points left_top_2, Points right_bottom_2) {
        if  ((left_top_1.y < right_bottom_2.y || left_top_2.y < right_bottom_1.y) && (left_top_1.x > right_bottom_2.x || left_top_2.x>right_bottom_1.x))
            return false;
        return true;
    }
}
