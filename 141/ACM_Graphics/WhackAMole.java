/**
 *  Description: Play Whack-a-Mole game
 * 	File: WhackaMole.java
 * 	Author: Tina Ostrander 2/9/2016
 *    Modified by Susan Uland 1/31/2018
 *    Modified by Crystal Hess 6/10/2018
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.util.*;

public class WhackAMole extends GraphicsProgram {
	// class constants
	private static final int WIN_SIZE = 500;
	private static final int NUM_MOLES = 5;

	// class variable
	private static Random gen;

	// instance variables
	private ArrayList <Block> moles;
	private GLabel status;
	private int deadMoleCount;

	// game setup
	public void init() {
		this.setSize(WIN_SIZE, WIN_SIZE);
		this.getGCanvas().setBackground(Color.GREEN.darker());
		this.gen = new Random();
		this.moles = new ArrayList<Block>();
		this.deadMoleCount = 0;
		this.status = new GLabel("", 5, WIN_SIZE - 25);
		this.status.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.status.setColor(Color.BLUE);
		this.add(status);
		updateStatus();
		loadingScreen();
		addThings();
		updateStatus();
		this.addMouseListeners(); // this gives the program "ears"
	}

	public void run() {
		// the game runs while there are moles to be caught
		while (moles.size() > 0) {
			this.pause(gen.nextInt(1000) + 500);
			moveThings();
			updateStatus();
		}
		status.setLabel("GAME OVER! You caught " + deadMoleCount + " moles!");
	}

	public void loadingScreen() {
		GLabel instructions = new GLabel("CATCH THE MOLES! click to begin...", 15, 200);
		instructions.setColor(Color.BLACK);
		instructions.setFont(new Font("Tahoma", Font.BOLD, 25));
		this.add(instructions);
		waitForClick();
		this.remove(instructions);
	}

	public void updateStatus() {
		this.status.setLabel("Moles:   CAUGHT - " + deadMoleCount + "  ALIVE - " + moles.size());
	}

	public void addThings() {
		for (int i = 0; i < NUM_MOLES; i++) {
			generateMole();
		}
	}

	public void generateMole() {
		Mole mole = new Mole(gen.nextInt(WIN_SIZE - Mole.MOLE_WIDTH), gen.nextInt(WIN_SIZE - Mole.MOLE_WIDTH));
		this.moles.add(mole);
		this.add(mole);
	}

	public void moveThings() {
		for (Block b: moles) {
         if(b instanceof Mole) {
			   b.setLocation(gen.nextInt(WIN_SIZE - Mole.MOLE_WIDTH), gen.nextInt(WIN_SIZE - Mole.MOLE_WIDTH));
		   }
      }
	}

	public void mousePressed(MouseEvent e) {
		// Grab x and y coordinates of mouse press
		int x = e.getX();
		int y = e.getY();
		System.out.println("clicked at " + x + ", " + y);

		// Get the thing that was clicked on
		GObject obj = getElementAt(x, y);
		System.out.println("  ===> " + obj);

		if (obj instanceof Mole) {
			this.moles.remove(obj);
			this.remove(obj);
			this.deadMoleCount++;
		} else {
			generateMole();
		}
      
      //easter egg for faster testing
      if(x < 10 && y < 10) {
         for(int i = 0; i < moles.size(); i++) {
            if(moles.get(i) instanceof Mole) {
               this.remove(moles.get(i));
               this.moles.remove(moles.get(i));
            }
         }
      }
	}

	public static void main(String[] args) {
		new WhackAMole().start(args);
	}
}