package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot Olympic1 = new Robot(400, 500);
		Robot Olympic2 = new Robot(800, 700);
		Robot Olympic3 = new Robot(1200, 700);
		Robot Olympic4 = new Robot(1000, 500);
		Robot Olympic5 = new Robot(600, 500);

		Olympic1.setSpeed(10);
		Olympic2.setSpeed(10);
		Olympic3.setSpeed(10);
		Olympic4.setSpeed(10);
		Olympic5.setSpeed(10);


		
	
		
		
		

		new Thread(() -> {
			
			Olympic1.move(400);
			Olympic1.moveTo(400, 500);
			for(int i = 0; i < 1000; i++) {
				Olympic1.penDown();
				Olympic1.setPenColor(Color.GREEN);
				Olympic1.turn(1);
				Olympic1.move(4);
			}
		}).start();
		
		new Thread(() -> { 
			Olympic2.move(400); 
			Olympic2.moveTo(800, 700);
			for(int i = 0; i < 1000; i++) {
				Olympic2.penDown();
				Olympic2.setPenColor(Color.BLUE);
				Olympic2.turn(1);
				Olympic2.move(4);
			}
		}).start();
		
		new Thread(() -> { 
			Olympic3.move(400); 
			Olympic3.moveTo(1200, 700);
			for(int i = 0; i < 1000; i++) {
				Olympic3.penDown();
				Olympic3.setPenColor(Color.RED);
				Olympic3.turn(1);
				Olympic3.move(4);
			}
		}).start();
		
		new Thread(() -> { 
			Olympic4.move(400); 
			Olympic4.moveTo(1000, 500);
			for(int i = 0; i < 1000; i++) {
				Olympic4.penDown();
				Olympic4.setPenColor(Color.ORANGE);
				Olympic4.turn(1);
				Olympic4.move(4);
			}
		}).start();
		
		new Thread(() -> { 
			Olympic5.move(400); 
			Olympic5.moveTo(600, 500);
			for(int i = 0; i < 1000; i++) {
				Olympic5.penDown();
				Olympic5.setPenColor(Color.YELLOW);
				Olympic5.turn(1);
				Olympic5.move(4);
			}
		}).start();

	}
}
