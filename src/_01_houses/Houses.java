package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.miniaturize();
		rob.setSpeed(1000);
		rob.penDown();
		rob.setPenWidth(5);
		
		rob.moveTo(100, 500);
		Random randy = new Random();
	for (int i = 0; i < 6; i++) {
		int random = randy.nextInt(200);
		if (i % 2 == 1) {
			draw_house(random,50);
		}else {
			draw_building(random, 50);
		}
		draw_grass();
	}
		
		
		
	}
	public void draw_house(int wall, int roof) {
		rob.setRandomPenColor();
		rob.move(wall);
		rob.turn(35);
		rob.move(roof);
		rob.turn(120);
		rob.move(roof);
		rob.turn(25);
		rob.move(wall);
		rob.turn(-90);
	}
	public void draw_building(int wall, int roof) {
		rob.setRandomPenColor();
		rob.move(wall);
		rob.turn(90);
		rob.move(roof);
		rob.turn(90);
		rob.move(wall);
		rob.turn(-90);
	}public void draw_grass() {
		rob.setPenColor(0, 255, 0);
		rob.move(30);
		rob.turn(-90);
	}
}
