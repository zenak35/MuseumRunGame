
//timer package
import java.util.Timer;
import java.util.Date;  
public class FlowerPicker {
   /* public static void main (String[] args) {*/
        
        
        Point p = new Point (0.5, 0.5);
        //test for the game
        DrawMove flowerTest = new DrawMove (p);
        //timer
        int interval = 10000; // 10 sec
        Date timeToRun = new Date(System.currentTimeMillis() + interval);
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask()); 
            public void run() {
                Point p = new Point (0.5, 0.5);
                DrawMove flowerTest = new DrawMove (p);
                
                if (PennDraw.hasNextKeyTyped() == true){
                    char press = PennDraw.nextKeyTyped();
                    
                    //moves character left
                    if (press == 'f') {
                        
                        flowerTest.leftMove();
                        System.out.println("Left Move");
                        
                    }
                    
                    //moves character right
                    else if (press == 'h') {
                        flowerTest.rightMove();
                        System.out.println("Right Move");
                    }
                    
                    //moves character up
                    else if (press == 't') {
                        flowerTest.moveUp();
                        
                        System.out.println("Move Up");
                    }
                    
                    //moves character down
                    else  if (press == 'v') {
                        flowerTest.moveDown();
                        System.out.println("Move Down");
                    }
                    else System.out.println(" This game only uses the keys 'T', 'F', 'H','V'"+
                                            " Use those in order to move your character. Hurry! "+
                                            "Time is running!");
                    
                }
                elapsedTime = (new Date()).getTime() - startTime;
            }
        
        
        
        //System.out.println(flowerTest.numMoves());
        
    //}
}
