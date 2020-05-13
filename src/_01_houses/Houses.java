package _01_houses;

import org.jointheleague.graphical.robot.Robot;

 

public class Houses {
	Robot jojo=new Robot();
	public void run() {
		
		jojo.setSpeed(999);
		jojo.setX(30);
		jojo.setY(970);
		Robot.setWindowSize(10000, 1000);
	jojo.penDown();
	//e
	House("large", "blue");
	House("small","YELLOW");
	for (int i = 0; i <3; i++) {
		
	
	House("medium", "cyan");
	}
	
	}
	
	public void House(String height, String Color) {
		if (Color.equalsIgnoreCase("BLUE")) {
			jojo.setPenColor(0,0,255);
		}else if(Color.equalsIgnoreCase("GREEN")) {
			jojo.setPenColor(0,255,0);
		}else if(Color.equalsIgnoreCase("CYAN")) {
			jojo.setPenColor(0,255,255);
		}else if(Color.equalsIgnoreCase("Red")) {
			jojo.setPenColor(255,0,0);
		}else if(Color.equalsIgnoreCase("Black")) {
			jojo.setPenColor(0,0,0);
		}else if(Color.equalsIgnoreCase("Magenta")) {
			jojo.setPenColor(255,0,255);
		}else if(Color.equalsIgnoreCase("YELLOW")) {
			jojo.setPenColor(255,255,0);
		}
		if(height.equalsIgnoreCase("Small")) {
		
		jojo.move(60);
		drawPointyRoof();
		jojo.move(60);
		jojo.turn(-90);
		jojo.setPenColor(0,255,0);
		jojo.move(20);
		jojo.turn(-90);
		}else if(height.equalsIgnoreCase("medium")) {
			
			jojo.move(120);
			drawPointyRoof();
			jojo.move(120);
			jojo.turn(-90);
			jojo.setPenColor(0,255,0);
			jojo.move(20);
			jojo.turn(-90);
		}else if(height.equalsIgnoreCase("large")) {
			
			jojo.move(250);
			drawFlatRoof();
			jojo.move(250);
			jojo.turn(-90);
			jojo.setPenColor(0,255,0);
			jojo.move(20);
			jojo.turn(-90);
		}
		
		
	}
	public void drawPointyRoof() {
		jojo.turn(45);
		jojo.move(22);
		jojo.turn(90);
		jojo.move(22);
		jojo.turn(45);
	}
	public void drawFlatRoof() {
		jojo.turn(90);
		jojo.move(30);
		jojo.turn(90);
	}
	
}
