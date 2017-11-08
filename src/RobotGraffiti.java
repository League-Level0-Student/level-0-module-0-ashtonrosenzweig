import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot jakefromstatefarm = new Robot();
	jakefromstatefarm.setWindowImage("download.jpg");
	jakefromstatefarm.setSpeed(3000);
	jakefromstatefarm.setPenWidth(50);
	jakefromstatefarm.penDown();
	jakefromstatefarm.turn(45);
	jakefromstatefarm.move(100);
	jakefromstatefarm.turn(90);
	jakefromstatefarm.move(100);
	jakefromstatefarm.penUp();
	jakefromstatefarm.turn(180);
	jakefromstatefarm.move(50);
	jakefromstatefarm.turn(-45);
	jakefromstatefarm.penDown();
	jakefromstatefarm.move(70);
	jakefromstatefarm.penUp();
	jakefromstatefarm.move(200);
}
}
