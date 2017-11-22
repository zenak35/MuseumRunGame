/**********************************************************************
  *  project1.txt template                                                   
  *  Project Part 1
  **********************************************************************/

PARTNER 1 (whose PennKey would come first in alphabetical order)
    Partner 1 Name: Zena Kipkenda
    Partner 1 PennKey: kipkenda
    Partner 1 Recitation #: 212
    
    PARTNER 2 (whose PennKey would come second in alphabetical order)
    (If you chose to do this project without a partner, write NONE in each spot below.)
    Partner 2 Name: Roberta Nin Feliz
    Partner 2 PennKey: ninfeliz
    Partner 2 Recitation #: 212
    
    
    /**********************************************************************
      *  Put your description of your project below.  It should be several
      *  paragraphs and cover all of the aspects in the section "Planning
      *  Your Project".
      **********************************************************************/
    High – Level Goal
    
    The project is about a simple game called ‘Flower Picker’
    This game involves a female character that moves over a grassy field picking items i.e. flowers or candy. 
    The user has a certain amount of time over which they can pick the items and when this time expires, 
    the screen clears and the number of items they picked, the number of moves, plus a message are displayed on the screen.
    
    Design and Interaction
    
    ·      The character will be an image with given start coordinates e.g. (0, 0) (0.5, 0.5)
    
    ·      The character can move left, right, up and down depending on what key the user presses. 
    The movement of the character will be in form of a linked list, 
    where each movement is a Node that contains a point. 
    For example, if the character moves up, a new Node is created with a point that mimics upward movement. 
    In the movement, we only change the coordinate points of the image character.
    
    ·      The items will also be images and they will be scattered randomly throughout the game canvas. 
    If the user moves and the point it moves to coincides with an item point, 
    the item will disappear i.e. call PennDraw.CLEAR and then draw everything 
    else except the item that has been ‘picked’
    
    ·      Keypresses will be the main interaction between the user and the game i.e. 
    The user will press certain keys to choose characters, move the character chosen etc.
    
    ·      Each image will be compressed to a certain small size so as to make the game feasible. 
    The characters will be bigger than the items.
    
    
    
    Testing
    ·      Testing for this program will mainly be in the game canvas.
    ·      Testing will be done with simple shapes first before moving onto more complex images.
    
    Challenges
    ·      Incorporating a timer API into the program from scratch
    
    ·      Making the items which have been ‘picked’ disappear.
    
    ·      Making the code as efficient and concise as possible i.e. 
    I think there will be many if-else statements because of the different user interactions with keypresses 
    so how best to optimize this and other functions in the code.
    
    ·     Making sure the game doesn’t lag a lot
    
    
    
    
    
    
    
    /**********************************************************************
      *  How precisely will your project use the LinkedList you implemented?
      **********************************************************************/
    The movement of the character will use a linked list. 
    Each time the user presses a key for the character to go left, for example, 
    a new Node with a new point that mimics movement in the left direction.
    
    
    
    
    /**********************************************************************
      * How precisely will your project use recursion?
      **********************************************************************/
    The insert function of the LinkedList will be implemented recursively.
    the number of moves will also use a function that counts each time a Node is added, 
    and this will be done recursively.
    
    
    
    
    
    
    
    /**********************************************************************
      *  List whatever help (if any) that you received
      **********************************************************************/
    
    
    
    
    
    
    /**********************************************************************
      *  Describe any serious problems you encountered.                    
      **********************************************************************/
    
    
    
    
    /**********************************************************************
      *  List any other comments here. Feel free to provide any feedback   
      *  on how much you learned from doing the assignment, and whether    
      *  you enjoyed doing it.                                             
      **********************************************************************/
