
/**
 * 	Tina Ostrander
 * 	File: WhackaMole.java
 * 	Date: 2/9/2016
 *  Description: Play Whack-a-Mole game
 *  Modified by suland 1/31/2018
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class WhackAMole extends GraphicsProgram {
	private static final int WIN_SIZE = 400;
	private static final int MOLE_SIZE = 30;
	private static final int NUM_MOLES = 3;

	// Declare class variable
	private static RandomGenerator gen;
	// Declare instance variables
	private GOval mole1, mole2, mole3;
	private GLabel status;
	private int deadMoleCount;

	public void init() {
		this.setSize(WIN_SIZE, WIN_SIZE);
		gen = new RandomGenerator();

		deadMoleCount = 0;
		status = new GLabel("Dead Mole Count: " + deadMoleCount, 10, 50);
		status.setFont(new Font("Arial", Font.BOLD, 24));
		status.setColor(Color.RED);
		this.add(status);
		drawMoles();
		this.addMouseListeners(); // this gives the program "ears"
	}

	public void moveMoles() {

		mole1.setLocation(gen.nextInt(WIN_SIZE - MOLE_SIZE), gen.nextInt(WIN_SIZE - MOLE_SIZE));
		mole2.setLocation(gen.nextInt(WIN_SIZE - MOLE_SIZE), gen.nextInt(WIN_SIZE - MOLE_SIZE));
		mole3.setLocation(gen.nextInt(WIN_SIZE - MOLE_SIZE), gen.nextInt(WIN_SIZE - MOLE_SIZE));

	}

	public void run() {
		while (true) {
			pause(1000);
			moveMoles();

			if (deadMoleCount == 3)
				status.setLabel("Game Over");
		}

	}

	public void drawMoles() {
		mole1 = new GOval(MOLE_SIZE, MOLE_SIZE);
		mole1.setFilled(true);
		add(mole1, gen.nextInt(WIN_SIZE - MOLE_SIZE), gen.nextInt(WIN_SIZE - MOLE_SIZE));

		mole2 = new GOval(MOLE_SIZE, MOLE_SIZE);
		mole2.setFilled(true);
		add(mole2, gen.nextInt(WIN_SIZE - MOLE_SIZE), gen.nextInt(WIN_SIZE - MOLE_SIZE));

		mole3 = new GOval(MOLE_SIZE, MOLE_SIZE);
		mole3.setFilled(true);
		add(mole3, gen.nextInt(WIN_SIZE - MOLE_SIZE), gen.nextInt(WIN_SIZE - MOLE_SIZE));
	}// end addMoles

	public void mousePressed(MouseEvent e) {
		// Grab x and y coordinates of mouse press
		int x = e.getX();
		int y = e.getY();
		println(x + ", " + y);

		// Get the thing that was clicked on
		GObject obj = getElementAt(x, y);
		System.out.println(obj);

		// If some oval was clicked
		if (obj instanceof GOval) {
			remove(obj);
			deadMoleCount++;
			status.setLabel("Dead Mole Count: " + deadMoleCount);
		}
		moveMoles();
	}

	public static void main(String[] args) {
		new WhackAMole().start(args);
	}

}// end class