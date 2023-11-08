import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class MapGenerator {
	
	public int map[][]; //think this makes it into an array?? Or maybe a custom size that can be user inputted
	public int brickWidth;
	public int brickHeight;
	
	public MapGenerator (int row, int column) { //the public calls the above integers
		
		map = new int [row][column];
			for (int i = 0; i <map.length; i++) {
				
				for(int j = 0; j<map[0].length; j++) {
					map[i][j] = 1;	
				}
				
			}
			
			brickWidth = 540/column;
			brickHeight = 150/row;
			
	}
	
	public void draw(Graphics2D g) 
	{
		
		for(int i = 0;i<map.length; i++) 
		{
			
			for(int j = 0; j<map[0].length; j++) 
			{
				
				if(map[i][j] > 0) 
				{
					
					g.setColor(Color.white);
					g.fillRect(j * brickWidth + 80, i + brickHeight + 50, brickWidth, brickHeight);
					
					
					//to show separate brick, game can run without. Test later
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i + brickHeight + 50, brickWidth, brickHeight);
					
				}
			}
			
		}
	}
	
	public void setBrickValue(int value, int row, int column)
	{
		map[row][column] = value;
		
	}

}
