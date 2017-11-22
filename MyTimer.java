import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;


public class MyTimer {
    
    private long time;
  
    public MyTimer() {
    
        time = System.currentTimeMillis();
        
    
    }
    
      /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - time) / 1000.0;
    }
    
}