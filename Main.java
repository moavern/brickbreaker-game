import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;


public class Main {
	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		obj.setBounds(10,10,700,600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay); //error. I think its due to Gameplay class currently being empty
		obj.setVisible(true);
		
	}

}



//Free bugs and issues when it comes to hitting the bricks (bricks not disappering, ball sometimes hitting nothing). Fix later