import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FlowerPicker0 {
    //private String characterFile
    
    /*private static boolean timer() {
    
    long timePassed = System.currentTimeMillis();
    
    if(timePassed == 60000)  return true;
    
    else return false;
    
}*/
    
    private static int cnt;

public static void main (String[] args){
    Point p = new Point (0.5, 0.5);
    final DrawMove flowerTest = new DrawMove (p);
    
    final MyTimer flowerCounter = new MyTimer();
    
    new JFrame().setVisible(true);
    
    ActionListener actListner = new ActionListener(){
        
        public void actionPerformed(ActionEvent event) {
            
            flowerCounter.start();
            
            while(true) {
                
                if(PennDraw.hasNextKeyTyped() == true){
                    char press = PennDraw.nextKeyTyped();
                    
                    if(press == 'f') {
                        
                        flowerTest.leftMove();
                        System.out.println("Left Move");
                        
                    }
                    
                    else if(press == 'h') {
                        flowerTest.rightMove();
                        System.out.println("Right Move");
                    }
                    
                    else if(press == 't') {
                        flowerTest.moveUp();
                        
                        System.out.println("Move Up");
                    }
                    
                    else  if(press == 'v') {
                        flowerTest.moveDown();
                        System.out.println("Move Down");
                    }
                    
                }
                
                cnt += 1;
                
                System.out.println("Counter = "+cnt);
                
                if(cnt == 5){
                   
                    flowerCounter.stop();
                
                }
                
            }
            
            
            
            
        }
        
        
        
        
    };
    
    
    
    
    
    
    
    //System.out.println(flowerTest.numMoves(head));
    
}

}