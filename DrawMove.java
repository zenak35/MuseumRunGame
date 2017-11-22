public class DrawMove {
    
    public Node head;
    //private int count;
    
    
    public DrawMove (Point p) {
        //draws museum background
        PennDraw.picture(0.5, 0.5, "background.png", 600, 600);
        //head used to traverse the linked list
        this.head = new Node (p, null);
        p.drawItems(.0125);
        p.drawCursor("cartoon girl.png", 80);
    }
    
    //set of controls allowing for a left move to be made
    public void leftMove() {
        
        for (Node curr = head; curr != null; curr = curr.next) {
            
            if (curr.next == null) {
                double newX = curr.point.getXCord() - 0.05;
                if(newX <= 0.05) {
                    newX = 0.96;
                    
                }
                double newY = curr.point.getYCord();
                
                Point newPoint = new Point (newX, newY);
                
                Node newNode = new Node (newPoint, null);
                curr.next = newNode;
                PennDraw.clear();
                newPoint.drawItems(.0125);
                newPoint.drawCursor("cartoon girl.png", 80);
                System.out.println("Node added");
                //count ++;
                return;
                
                
            }
            
        }
        
    }
    //set of controls allowing for a right move to be made 
    public void rightMove() {
        
        for(Node curr = head; curr != null; curr = curr.next) {
            
            if(curr.next == null){
                double newX = curr.point.getXCord() + 0.05;
                if (newX >= 0.96) {
                    newX = 0.05;
                }
                double newY = curr.point.getYCord();
                
                Point newPoint = new Point (newX, newY);
                
                Node newNode = new Node (newPoint, null);
                curr.next = newNode;
                PennDraw.clear();
                newPoint.drawItems(.0125);
                newPoint.drawCursor("cartoon girl.png", 80);
                System.out.println("Node added");
                //count ++;
                return;
                
                
            }
            
        }
        
    }
    //set of controls allowing for the character to move up 
    public void moveUp() {
        
        for(Node curr = head; curr != null; curr = curr.next) {
            
            if(curr.next == null){
                double newX = curr.point.getXCord();
                double newY = curr.point.getYCord() + 0.05;
                if(newY >= 0.96){
                    newY = 0.05;
                    
                }
                
                Point newPoint = new Point (newX, newY);
                
                Node newNode = new Node (newPoint, null);
                curr.next = newNode;
                PennDraw.clear();
                newPoint.drawItems(.0125);
                newPoint.drawCursor("cartoon girl.png", 80);
                System.out.println("Node added");
                //count ++; 
                return;
                
                
            }
            
        }
        
    }
    
    //set of controls allowing for the character to move down 
    public void moveDown() {
        
        for(Node curr = head; curr != null; curr = curr.next) {
            
            if(curr.next == null){
                double newX = curr.point.getXCord();
                double newY = curr.point.getYCord() - 0.05;
                if(newY <= 0.05){
                    newY = 0.96;
                    
                }
                
                Point newPoint = new Point (newX, newY);
                
                Node newNode = new Node (newPoint, null);
                curr.next = newNode;
                PennDraw.clear();
                newPoint.drawItems(.0125);
                newPoint.drawCursor("cartoon girl.png", 80);
                System.out.println("Node added");
                return;
                
                
            }
            
        }
        
    }
    
    //method returning how many moves were made
    public int numMoves(Node curr) {
        
        // base case
        if (curr == null) {
            return 0; 
        } else {
            // recursive call 
            return 1 + numMoves(curr.next); 
        }  
//return count;
    }
    
    
}