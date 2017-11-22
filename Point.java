/**
 * Partner 1:
 * Name : Zena Kipkenda
 * PennKey : kipkenda
 * Recitation : 212
 * 
 * Partner 2:
 * Name : Roberta Nin Feliz
 * PennKey : ninfeliz
 * Recitation : 212
 * 
 * Execution: java Point
 *
 * Point class that creates a point object which is used in the linked list.
 * 
 * Creates drawing of character and random alarms.
 * 
 * Imports a java.util.* , that's used to create ArrayList
 * that stores points for random alarms.
 *
 */
import java.util.*;
public class Point {
    
    private  double xCord;
    private  double yCord;
    private double size;
    public static int numAlarms = 0;
    
    public Point (double x, double y) {
        
        this.xCord = x;
        this.yCord = y;
    }
    //getter method for individual points in ArrayList
    public  double returnXCord (Point p) {
        return p.xCord;
    }
    public  double returnYCord (Point p) {
        return p.yCord;
    }
    
    //getter methods for the character  
    public double getXCord() {
        return xCord;
    }
    
    public double getYCord() {
        return yCord;
    }
    //draws the character in the game
    public void drawCursor(String filename, double size) { 
        
        PennDraw.picture(xCord, yCord, filename, size, size);
    }
    
    //draws background and items
    public void drawItems (double width) {
        PennDraw.picture(0.5, 0.5, "museum.png", 600, 600);
        PennDraw.setPenColor(PennDraw.BLACK);
        //Arraylist that  generates positions for the items to be drawn
        List <Point> items = new ArrayList<Point>();
        
        
        items.add( new Point (.4, .4));
        items.add( new Point (.6, .7));
        items.add( new Point (.3, .6));
        items.add( new Point (.7, .3));
        items.add( new Point (.6, .6));
        items.add( new Point (.9, .6));
        items.add( new Point (.7, .4));
        items.add( new Point (.58, .8));
        items.add( new Point (.8, .2));
        items.add( new Point (.2, .4));
        items.add( new Point (.4, .9));
        items.add( new Point (.6, .0));
        items.add( new Point (.34, .56));
        
        
        int i = 0;
        //goes through the ArrayList and draws the points
        while (i < items.size()) {
            
            Point p = items.get(i);
            double xCenter = returnXCord(p);
            double yCenter = returnYCord(p);
            
            //random condition that sets off certain alarms (makes them red)
            if (xCenter - xCord <= size / 2  + width / 2  && yCenter - yCord <= size / 2  + width / 2) {
                PennDraw.setPenColor(PennDraw.RED);
                PennDraw.filledSquare(xCenter, yCenter, width);
                numAlarms++;
            }
            
            //draws alarms that are not set off (makes them black)
            else {
                PennDraw.setPenColor(PennDraw.BLACK);
                PennDraw.filledSquare(xCenter, yCenter, width);
            }
            i++; 
            
            //print out how many alarms you set off in the time alotted
            //System.out.println(numAlarms);
        }
    }
    public static void main (String [] args) {
        //testing
        Point temp = new Point (.5, .5);
        temp.drawItems(.05);
        
        
        
    }
    
    
}

