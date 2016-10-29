package rectangularLove;

public class Rectangle {

	Integer leftX;
	Integer bottomY;
	
	Integer height;
	Integer width;
	
	public Rectangle(){}
	
	public Rectangle(Integer leftX,Integer bottomY,Integer height,Integer width){
		
		this.bottomY=bottomY;
		this.leftX=leftX;
		this.height=height;
		this.width=width;
		
	}
	
	public String toString()
	{
		return String.format("(%d,%d,%d,%d)", leftX,bottomY,height,width);
		
	}
	
}
