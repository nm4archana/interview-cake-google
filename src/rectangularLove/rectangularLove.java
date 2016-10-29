package rectangularLove;

/*
 A crack team of love scientists from OkEros (a hot new dating site) have devised a way to represent dating profiles as rectangles on a two-dimensional plane.
They need help writing an algorithm to find the intersection of two users' love rectangles. They suspect finding that intersection is the key to a matching algorithm so powerful it will cause an immediate acquisition by Google or Facebook or Obama or something.

Write a function to find the rectangular intersection of two given love rectangles.

As with the example above, love rectangles are always "straight" and never "diagonal." More rigorously: each side is parallel with either the x-axis or the y-axis.

They are defined as objects of Rectangle class:

  public class Rectangle {

    // coordinates of bottom left corner
    Integer leftX;
    Integer bottomY;

    // dimensions
    Integer width;
    Integer height;

    public Rectangle(Integer leftX, Integer bottomY, Integer width, Integer height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }

    public Rectangle() {}

    public String toString() {
        return String.format("(%d, %d, %d, %d)", leftX, bottomY, width, height);
    }
}

Your output rectangle should be a Rectangle object as well.
 */


//Incomplere
public class rectangularLove{

	
	public Rectangle RectangularLove(Rectangle rectangle1,Rectangle rectangle2)
	{
		Rectangle rectangle=new Rectangle();
		
		if(rectangle1.leftX<rectangle2.leftX&&rectangle1.bottomY<rectangle2.bottomY)
		{
			rectangle.leftX=rectangle2.leftX;
			rectangle.bottomY=rectangle2.bottomY;
			rectangle.height=Math.abs((rectangle1.bottomY+rectangle1.height)-Math.abs(rectangle2.bottomY-rectangle1.bottomY));	
			rectangle.width=Math.abs(rectangle2.leftX+rectangle2.width-Math.abs(rectangle2.leftX-rectangle1.leftX));
			
		}
		else if(rectangle1.leftX<rectangle2.leftX&&rectangle1.bottomY>rectangle2.bottomY)
		{
			rectangle.bottomY=rectangle1.bottomY;
			rectangle.leftX=rectangle2.leftX;
			rectangle.height=Math.abs(rectangle2.bottomY+rectangle2.height-Math.abs((rectangle1.bottomY-rectangle2.bottomY)));
			rectangle.width=Math.abs(rectangle1.leftX+rectangle1.width-Math.abs((rectangle2.leftX-rectangle1.leftX)));
		}
		else if(rectangle1.leftX>rectangle2.leftX&&rectangle1.bottomY>rectangle2.bottomY)
		{
			rectangle.leftX=rectangle1.leftX;
			rectangle.bottomY=rectangle1.bottomY;
			rectangle.height=Math.abs(rectangle2.bottomY+rectangle2.height-Math.abs(rectangle1.bottomY-rectangle2.bottomY));
			rectangle.width=Math.abs(rectangle1.leftX+rectangle1.width-Math.abs((rectangle2.leftX-rectangle1.leftX)));		
			
			
		}
		
		else if(rectangle1.leftX>rectangle2.leftX&&rectangle1.bottomY<rectangle2.bottomY)
		{
			rectangle.bottomY=rectangle2.bottomY;
			rectangle.leftX=rectangle1.leftX;
			rectangle.height=Math.abs(rectangle1.bottomY+rectangle1.height-Math.abs((rectangle2.bottomY-rectangle1.bottomY)));
			rectangle.width=Math.abs(rectangle2.leftX+rectangle2.width-Math.abs((rectangle1.leftX-rectangle2.leftX)));
		
		}
		
		
		return rectangle;
	}
	
	public static void main(String[] args)
	{
		
	}
	
}
