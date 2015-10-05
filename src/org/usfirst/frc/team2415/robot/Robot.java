
package org.usfirst.frc.team2415.robot;


import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;

/**
 * This is a demo program showing the use of the RobotDrive class.
 * The SampleRobot class is the base of a robot application that will automatically call your
 * Autonomous and OperatorControl methods at the right time as controlled by the switches on
 * the driver station or the field controls.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're inexperienced,
 * don't. Unless you know what you are doing, complex code will be much more difficult under
 * this system. Use IterativeRobot or Command-Based instead if you're new.
 */
public class Robot extends SampleRobot {
	
	DriveSystem driveSystem;
	
    public Robot() {
    	driveSystem = new DriveSystem(Ports.LEFT_MOTORS, Ports.RIGHT_MOTORS, Ports.LEFT_ENCODERS, Ports.RIGHT_ENCODERS);
    }
    
    
    /*	Write your code here. There are three commands:
     * 	driveSystem.left(ticks)    	:turns the robot left for a certain amount of ticks
     *  driveSystem.right(ticks)		:turns the robot right for a certain amount of ticks
     *  driveSystem.straight(ticks)	:drives the robot forwards for a certain amount of ticks
     *  driveSystem.delay(time)
     *  
     *  Example:
     *  
	 *  driveSystem.straight(200)
	 *  
	 *  <<drives the robot for 200 ticks>>
     * */
    public void autonomous() {
    	//MAKE ME DO STUFF :D!!!!!
    	
    	
    	
    }
    
    public void operatorControl() {
    }
    
    public void test() {
    }
}
