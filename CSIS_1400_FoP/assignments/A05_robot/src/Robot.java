/*********************************************************************
 * The Robot class represents a robot that can move and speak.
 * 
 * Do NOT modify
 * 
 *********************************************************************/

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Robot {
	
	
	private DoorRoom room;
	private int x;
	private int y;

	/**
	 * Creates a robot at the given location in the given room
	 * @param room the room in which to place the robot
	 * @param sx the starting x position of the robot
	 * @param sy the starting y position of the robot
	 */
	public Robot(DoorRoom room, int sx, int sy) {
		this.room = room;
		this.x = sx;
		this.y = sy;
		this.show();
		try { Thread.sleep(100); } catch (InterruptedException e) {}
	}
   
	/**
	 * Creates a robot at the top-left corner of the given room
	 * @param room the room in which to place the robot
	 */
	public Robot(DoorRoom room) {
		this(room,0,0);
	}
   
	/**
	 * Creates a robot at the given location in the given room
	 * @param grid grid[x][y] = true if there is a room in that spot, false otherwise
	 * @param sx the starting x position of the robot
	 * @param sy the starting y position of the robot
	 */
	public Robot(boolean[][] grid, int sx, int sy) {
		this(new DoorRoom(grid), sx, sy);
	}
   
	/**
	 * Creates a robot at the top-left corner of the given room
	 * @param grid grid[x][y] = true if there is a room in that spot, false otherwise
	 */
	public Robot(boolean[][] grid) {
		this(new DoorRoom(grid));
	}
   
	/**
	 * Creates a robot at the given location in the given room
	 * @param grid spaces are walls, letters are open spaces, and \n makes a new row
	 * @param sx the starting x position of the robot
	 * @param sy the starting y position of the robot
	 */
	public Robot(String grid, int sx, int sy) {
		this(new DoorRoom(grid), sx, sy);
	}
   
	/**
	 * Creates a robot at the top-left corner of the given room
	 * @param grid spaces are walls, letters are open spaces, and \n makes a new row
	 * @param sx the starting x position of the robot
	 * @param sy the starting y position of the robot
	 */
	public Robot(String grid) {
		this(new DoorRoom(grid));
	}
   
	/**
	 * Creates a robot at the given location in a w by h room
	 * @param w width of the grid
	 * @param h height of the grid
	 * @param sx the starting x position of the robot
	 * @param sy the starting y position of the robot
	 */
	public Robot(int w, int h, int sx, int sy) {
		this(new DoorRoom(w, h), sx, sy);
	}
   
	/**
	 * Creates a robot in the top-left corner of a w by h room
	 * @param w width of the grid
	 * @param h height of the grid
	 */
	public Robot(int w, int h) {
		this(new DoorRoom(w, h));
	}
   
	/**
	 * Look for a door
	 * @param dir one of 'n', 's', 'e', or 'w'. Capitalization does not matter.
	 * @return true if the robot sees a door in the given direction, false otherwise
	 */
	public boolean check(char dir) { 
		try { Thread.sleep(125); } catch (InterruptedException e) {}
		return room.isDoor(this.x, this.y, dir); 
	}
   
	/**
	 * Look for a door
	 * @param dir one of "n", "s", "e", or "w". Capitalization does not matter.
	 * @return true if the robot sees a door in the given direction, false otherwise
	 */
	public boolean check(String dir) { return this.check(dir.charAt(0)); }
	
	/**
	 * Move through the given door
	 * @param dir one of 'n', 's', 'e', or 'w'. Capitalization does not matter.
	 */
	public void go(char dir) {
		if (!this.check(dir)) {
			switch(dir) {
			case 'w': case 'W': for(double i=0; i<0.375; i+=0.03125) this.show(-i,0); break;
			case 'e': case 'E': for(double i=0; i<0.375; i+=0.03125) this.show(i,0);  break;
			case 'n': case 'N': for(double i=0; i<0.375; i+=0.03125) this.show(0,-i); break;
			case 's': case 'S': for(double i=0; i<0.375; i+=0.03125) this.show(0,i);  break;
			default: throw new IllegalArgumentException("Unknown direction: "+dir);
			}
			throw new Robot.HitWall();
		}
		switch(dir) {
		case 'w': case 'W': for(double i=0; i<1; i+=0.03125) this.show(-i,0); this.x -= 1; break;
		case 'e': case 'E': for(double i=0; i<1; i+=0.03125) this.show(i,0); this.x += 1; break;
		case 'n': case 'N': for(double i=0; i<1; i+=0.03125) this.show(0,-i); this.y -= 1; break;
		case 's': case 'S': for(double i=0; i<1; i+=0.03125) this.show(0,i); this.y += 1; break;
		default: throw new IllegalArgumentException("Unknown direction: "+dir);
		}
		this.show();
	}
   
	/**
	 * Move through the given door
	 * @param dir one of "n", "s", "e", or "w". Capitalization does not matter.
	 */
	public void go(String dir) { this.go(dir.charAt(0)); }
	
	private  void show() {
		this.room.drawBot(this.x, this.y);
	}
	private void show(double dx, double dy) {
		this.room.drawBot(this.x+dx, this.y+dy);
		try { Thread.sleep(10); } catch (InterruptedException e) {}
	}
	
	/**
	 * Show a message in front of the rooms
	 * @param msg The message to show
	 */
	public void say(Object msg) {
		JLabel l = new JLabel(String.valueOf(msg));
		l.setFont(new Font(l.getFont().getName(), Font.PLAIN, 32));
		JOptionPane.showMessageDialog(this.room.window, l, "The robot says:", JOptionPane.PLAIN_MESSAGE);
	}

	@SuppressWarnings("serial") private static class HitWall extends RuntimeException {}
	
}
