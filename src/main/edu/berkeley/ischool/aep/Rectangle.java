package edu.berkeley.ischool.aep;

/**
 * Understands a four-sided figure with sides at right angles
 */
public class Rectangle {
    private static int height;
    private static int length;

    //constructors
    public Rectangle(int height, int length)
    {
        this.height = height;
        this.length = length;
    }


    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public static void main()
    {
        Rectangle myRectangle = new Rectangle(10,10);
        Rectangle myRectangle2 = new Rectangle(200,200);
    }

    public int area() {
        return height*length;
    }
}
