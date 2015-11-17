
package org.usfirst.frc.team2415.robot;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.SampleRobot;

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
	
	Talon left, right;
	
	WiredCatGamepad gamepad;
	
    public Robot() {
    	left = new Talon(0);
    	right = new Talon(9);
    	
    	gamepad = new WiredCatGamepad(0);
    }
    
    public void autonomous() {}
    
    public void operatorControl() {
    	//Write code here
    	
    }
    
    public void updateLeft(){
    	/*This function will update the left motor according the the driver's input
    	 * on the controller.*/
    	
    }
    
    public void updateRight(){
    	/*This function will update the right motor according the the driver's input
    	 * on the controller.*/
    	
    }
    
    public void test() {
    }
}
