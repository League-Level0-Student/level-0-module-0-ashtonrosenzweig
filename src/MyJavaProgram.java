import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot jakefromstatefarm = new Robot();
	
	jakefromstatefarm.setWindowImage("download.png");
	jakefromstatefarm.penDown();
	jakefromstatefarm.setSpeed(100);
	for (int i = 0; i < 4; i++) {
	jakefromstatefarm.move(100);
	jakefromstatefarm.turn(90);
	}
	jakefromstatefarm.penUp();
	jakefromstatefarm.move(200);
	}
}
