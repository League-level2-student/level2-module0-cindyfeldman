package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static //1. make a main method
	boolean isracing = true;
public static void main(String[] args) {
Robot one[]= new Robot[5];
for (int i = 0; i < one.length; i++) {
	one[i]=new Robot();
	one[i].setY(500);
	one[i].setX(500);
}
Random r = new Random();
while(isracing==true) {
for (int i = 0;i < one.length; i++) {
	if (one[i].getY()<0) {
		isracing= false;
	}
	one[i].move(r.nextInt(50));
}

}}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
