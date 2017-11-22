public class LinkedList {

  public Node head;
  
  
  public LinkedList (Point p) {
     
        PennDraw.setPenColor(PennDraw.GREEN);
        PennDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);   
        
        PennDraw.setPenColor(PennDraw.BLACK);
        p.drawCircle(0.1);
        this.head = new Node (p, null);
  
  }
  
  public void leftMove() {
  
      
      
      for(Node curr = head; curr != null; curr = curr.next) {
      
          if(curr.next == null){
             double newX = curr.point.getXCord() + 0.1;
              if(newX >= 0.96){
                      newX = 0.05;
                    
                    }
             double newY = curr.point.getYCord();
             
             Point newPoint = new Point (newX, newY);
             
             Node newNode = new Node (newPoint, null);
             curr.next = newNode;
             PennDraw.clear(PennDraw.GREEN);
             newPoint.drawCircle(0.1);
              System.out.println("Node added");
              return;
             
           
          }
      
      }
  
  
  
  
  
  }
    





}