import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarpetBot extends UrRobot
{
	/**
	 * Constructor for objects of class Pinsetter
	 */
	public CarpetBot(int st, int ave, Direction dir, int beeps)
	{
		super (9,2, South, 28);
	}
	
	public void carpet()
	{
	    oneWall();
	    oneWall();
	    oneWall();
	    oneWall();
	    
	    
	}
	public void putBeeperAndMove()
	{
	    putBeeper();
	    move();
	    
	    
	}
	public void oneWall()
	{
	    putBeeperAndMove();
	    putBeeperAndMove();
	    putBeeperAndMove();
	    putBeeperAndMove();
	    putBeeperAndMove();
	    putBeeperAndMove();
	    putBeeperAndMove();
	    turnLeft();
	    
	    
	}
	   

}
