//package com.javacodegeeks.snippets.ProjectHW9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Counter {

    private static int cnt;

    public static void main(String args[]) {

  new JFrame().setVisible(true);

  ActionListener actListner = new ActionListener() {

//@Override

public void actionPerformed(ActionEvent event) {

    cnt += 1;

    System.out.println("Counter = "+cnt);
    

}

  };

  Timer timer = new Timer(5, actListner);

  timer.start();
  if(cnt == 5){
    timer.stop();
  
  }
    }
}