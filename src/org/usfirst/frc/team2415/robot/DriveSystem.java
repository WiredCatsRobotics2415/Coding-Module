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
	
	public void straight(int ticks){
		int startL = leftE.get();
		int startR = rightE.get();
		while((Math.abs(leftE.get() - startL) + Math.abs(rightE.get() - startR))/2 < ticks){
			left.set(-0.5);
			right.set(0.5);
		}
		left.set(0);
		right.set(0);
	}
	
	public void left(int ticks){
		int startL = leftE.get();
		int startR = rightE.get();
		while((Math.abs(leftE.get() - startL) + Math.abs(rightE.get() - startR))/2 < ticks){
			left.set(0.5);
			right.set(0.5);
		}
		left.set(0);
		right.set(0);
	}
	
	public void right(int ticks){
		int startL = leftE.get();
		int startR = rightE.get();
		while((Math.abs(leftE.get() - startL) + Math.abs(rightE.get() - startR))/2 < ticks){
			left.set(-0.5);
			right.set(-0.5);
		}
		left.set(0);
		right.set(0);
	}
	
	public void delay(double time){
		long start = System.currentTimeMillis();
		while((System.currentTimeMillis() - start)/1000.0 < time);
	}
}
