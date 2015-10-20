package org.usfirst.frc.team2415.robot;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Encoder;

import com.kauailabs.nav6.frc.IMU;

/**
 * This Class contains code for all components that constitute the Drive System.
 * @author jabaribooker
 *
 */
public class DriveSystem {
	
    private double inchesPerTicks = (4*Math.PI)/128;

	private final int BAUD_RATE = 57600;
	private final byte REFRESH_RATE = 50;
	
	private Talon left, right;
	private Encoder leftE, rightE;
	
	private IMU imu;
	
	public DriveSystem(int leftTalon, int rightTalon, int leftEncoder[], int rightEncoder[]){
		left = new Talon(leftTalon);
		right = new Talon(rightTalon);
		leftE = new Encoder(leftEncoder[0], leftEncoder[1]);
		rightE = new Encoder(rightEncoder[0], rightEncoder[1]);
		
		SerialPort imuSerialPort = new SerialPort(BAUD_RATE, SerialPort.Port.kMXP);
		imu = new IMU(imuSerialPort, REFRESH_RATE);
	}
	
	/**
	 * This function causes the robot to drive forwards a given distance
	 * @param dist (inches) desired distance to travel forwards
	 */
	public void forward(double dist){
		int start = getTicks();
		while((getTicks() - start)*inchesPerTicks < dist){
			left.set(0.5);
			right.set(-0.5);
		}
		left.set(0);
		right.set(0);
	}
	
	/**
	 * This function causes the robot to drive backwards a given distance
	 * @param dist (inches) desired distance to travel backwards
	 */
	public void backward(double dist){
		int start = getTicks();
		while((getTicks() - start)*inchesPerTicks < dist){
			left.set(0.5);
			right.set(-0.5);
		}
		left.set(0);
		right.set(0);
	}
	
	/**
	 * This function causes the robot to rotate to the left a given angle
	 * @param angle (degrees) a desired angle to rotate between -180 and 0
	 */
	public void left(double angle){
		imu.zeroYaw();
		while(-getAngle() < 180){
			left.set(-0.5);
			right.set(-0.5);
		}
		if(angle > 180) left(angle-180);
		
		left.set(0);
		right.set(0);
		imu.zeroYaw();
	}

	/**
	 * This function causes the robot to rotate to the right a given angle
	 * @param angle (degrees) a desired angle to rotate between 0 and 180
	 */
	public void right(double angle){
		imu.zeroYaw();
		while(getAngle() < 180){
			left.set(0.5);
			right.set(0.5);
		}
		if(angle > 180) right(angle-180);
		
		left.set(0);
		right.set(0);
		imu.zeroYaw();
	}
	
	private int getTicks(){
		return(Math.abs(leftE.get()) + Math.abs(rightE.get()))/2;
	}
	
	private double getAngle(){
		return imu.getYaw();
	}
	
	/**
	 * Commands the robot to sit and do nothing for a give time
	 * @param time (seconds) the amount of time to wait
	 */
	public void delay(double time){
		long start = System.currentTimeMillis();
		while((System.currentTimeMillis() - start)/1000.0 < time);
	}
}
