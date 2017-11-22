public class FlowerPicker{
    
    private boolean yes;
    
    
    public static void main (String[] args) {
        
        
        Point p = new Point (0.5, 0.5);
        Node head = new Node(p, null);
        DrawMove flowerTest = new DrawMove (p);
        PennDraw.setFontSize(20);
        PennDraw.setPenColor(PennDraw.BLACK);
        PennDraw.text(0.5, 0.5, "This game is called Museum Run.");
        PennDraw.text(.45, .45, "You are stuck in a museum"); 
        PennDraw.text(.4, .4, "            but you are trying to find the quickest way out");
        PennDraw.text(.35, .35, "                                  without setting off the alarms. A red square" );
        PennDraw.text(.30, .30, "                                  means you have set an alarm off.");
        PennDraw.text(.25, .25, "                               A Black one means you're good.");
        PennDraw.text(.20, .20, "                                                     You have a limited amount of time to get it right.");
        PennDraw.text(.10, .10, "                                                                    Press F, H, T or V to start the game");
        
        //timer setting up the amount of time needed for the game to run
        MyTimer timer1 = new MyTimer();
        boolean over = true;
        
        while(over) {
            
            if (timer1.elapsedTime() == 60 ) {
                
                over = false;
                PennDraw.clear();
                System.out.println("Game Over");
                PennDraw.setFontSize(60);
                PennDraw.text(0.5, 0.5, "GAME OVER!!!");
                 String s = "Your total moves were: " + flowerTest.numMoves(head);
                 PennDraw.setFontSize(25);
                 PennDraw.text(0.5, 0.4, s);
                
                
            }
            
            else if(PennDraw.hasNextKeyTyped() == true){
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
                else { System.out.println("This game only uses the keys F, T, H and V.");
                    
                }
                
                
            }
            
        }
    }
    
    
}