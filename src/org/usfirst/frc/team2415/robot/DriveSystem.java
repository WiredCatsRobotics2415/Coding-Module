package org.usfirst.frc.team2415.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Encoder;

public class DriveSystem {
	
	private Talon left, right;
	private Encoder leftE, rightE;
	
	public DriveSystem(int leftTalon, int rightTalon, int leftEncoder[], int rightEncoder[]){
		left = new Talon(leftTalon);
		right = new Talon(rightTalon);
		leftE = new Encoder(leftEncoder[0], leftEncoder[1]);
		rightE = new Encoder(rightEncoder[0], rightEncoder[1]);
	}
	
	public void straight(float time){
		long startTime = System.currentTimeMillis();
		while((System.currentTimeMillis() - startTime)/1000.0 < time){
			left.set(0.5);
			right.set(-0.5);
		}
	}
	
	public void left(float time){
		long startTime = System.currentTimeMillis();
		while((System.currentTimeMillis() - startTime)/1000.0 < time){
			left.set(-0.5);
			right.set(-0.5);
		}
	}
	
	public void right(float time){
		long startTime = System.currentTimeMillis();
		while((System.currentTimeMillis() - startTime)/1000.0 < time){
			left.set(0.5);
			right.set(0.5);
		}
	}
}
