import kareltherobot.*;
/**
 * Write a description of class NasaBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarpetBotDriver implements Directions
{
    public static void main(String args[])
    {
        CarpetBot karel = new CarpetBot(9,2,South, 28);
        karel.carpet();
    }
    static
    {
    	World.reset();	
    	World.readWorld("ch3_8.kwld");
    	World.setDelay(5);
    	World.setVisible(true);    	
    }
    
}
