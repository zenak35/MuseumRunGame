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
 * Execution: java MuseumTest
 *
 * This is the main testing class and it basically 
 * tests all the functions in DrawMove using keypresses.
 * It also utilises the MyTimer class and initiates a timer
 * for use in the game.
 * 
 */
public class MuseumTest{
    
    public static void main (String[] args) {
        
        //initializes constructor and gives start message
        Point p = new Point (0.5, 0.5);
        Node head = new Node (p, null);
        DrawMove gameTest = new DrawMove (p);
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
            
            //when game is over
            if (timer1.elapsedTime() == 10 ) {
                
                over = false;
                PennDraw.clear();
                //System.out.println("Game Over");
                PennDraw.setFontSize(40);
                if (p.numAlarms != 0) { 
                    PennDraw.text(0.5, 0.5, "GAME OVER!! You lost");
                }
                else {
                    PennDraw.text(0.5, 0.5, "CONGRATS! You won");
                }
                PennDraw.setFontSize(30);
                String s = "You made " + gameTest.numMoves() + " moves.";
                PennDraw.text(0.5, 0.4, s);
                
                
            }
            
            //start game by pressing keys
            else if(PennDraw.hasNextKeyTyped() == true){
                char press = PennDraw.nextKeyTyped();
                
                
                //moves character left
                if(press == 'f') {
                    
                    gameTest.leftMove();
                    //System.out.println("Left Move");
                    
                }
                
                //moves character right
                else if(press == 'h') {
                    gameTest.rightMove();
                    //System.out.println("Right Move");
                }
                
                //moves character up
                else if(press == 't') {
                    gameTest.moveUp();
                    
                    //System.out.println("Move Up");
                }
                
                //moves character down
                else  if(press == 'v') {
                    gameTest.moveDown();
                    //System.out.println("Move Down");
                }
                
                //error message if user presses wrong keys
                else { 
                    //System.out.println("This game only uses the keys F, T, H and V.");
                    
                }
                
                
            }
            
        }
    }
    
    
}