import java.util.Scanner;

public class Project1_toni_dotson
{  
     public static void main(String[] args)
      {
         double btu;
  
         double roomLength; //to hold the rooms length
         double roomWidth; //to hold the rooms width
         int shade = 0; //to hold the rooms shade
         
         //constants to hold menu choice
         final int littleShade = 1;
         final int moderateShade = 2;
         final int abundantShade = 3;
         
         //constants to hold BTU
          double btu1 = 5500.00;//sq feet under 250 = BTU/hr with moderate shade
          double btu2 = 10000.00;//sq feet >= 250 && <500 = BTU/hr with moderate shade
          double btu3 = 17500.00;//sq feet > 500 & sq feet < 1000 = BTU/hr with moderate shade
          double btu4 = 24000.00;//sq feet >= 1000 with moderate shade
          
         Scanner keyboard = new Scanner(System.in); //scanner object
         
         
         System.out.print("Please enter the length of the room (in feet): ");
         roomLength = keyboard.nextDouble(); //reads users input
         
         System.out.print("Please enter the width of the room (in feet): ");
         roomWidth = keyboard.nextDouble();
         
         //display menu
         System.out.println("What is the amount of shade that this room receives?: ");
         
         System.out.println("1. Little Shade");
         
         System.out.println("2. Moderate Shade");
         
         System.out.println("3. Abundant Shade");
         
         
         System.out.print("\nEnter your choice: "); //Have user enter a number from the choices
         btu = keyboard.nextDouble(); //reads users input
         
         System.out.println("Air Conditioning Window Unit Cooling Capacity");
         
           //constants to hold the rooms area (roomSize)
          double roomSize = roomLength * roomWidth;
          
           //determine capacity of air conditioning unit
           if(btu == littleShade && roomSize < 250 )
            {
                  double finalbtu =  btu1 + .15d;
                  
                  System.out.println("Room Area(in square feet): " +
                                                               roomSize);
                        System.out.println("Amount of Shade: " + 
                                                                  btu);
                        System.out.println("BTU's per Hour needed: " + 
                                                                     finalbtu);
            
            }
           else if(btu == littleShade && roomSize >= 250 && roomSize < 500)
           {
                  double finalbtu = btu2 + .15d;
                  System.out.println("Room Area(in square feet): " +
                                                               roomSize);
                        System.out.println("Amount of Shade: " + 
                                                                  btu);
                        System.out.println("BTU's per Hour needed: " + 
                                                                     finalbtu);
           }
           else if(btu == littleShade &&  roomSize > 500 && roomSize < 1000)
           {
               double finalbtu = btu3 + .15d;
                        System.out.println("Room Area(in square feet): " +
                                                               roomSize);
                        System.out.println("Amount of Shade: " + 
                                                                  btu);
                        System.out.println("BTU's per Hour needed: " + 
                                                                     finalbtu);
           }
           else if(btu == littleShade && roomSize >= 1000)
           {
               double finalbtu = btu4 + .15d;
                        System.out.println("Room Area: " +
                                                               roomSize);
                        System.out.println("Amount of Shade: " + 
                                                                  btu);
                        System.out.println("BTU's per Hour needed: " + 
                                                                     finalbtu);
           }
           
           
           if(btu == abundantShade && roomSize < 250 )
            {
            
               double finalbtu = btu1 - (btu1 * .10);
               System.out.println("Room Area: " + 
                                                      roomSize);
                        System.out.println("Amount of Shade: " + 
                                                            btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                   finalbtu);
            }
           else if(btu == abundantShade && roomSize >= 250 && roomSize < 500)
           {
               double finalbtu = btu2 - (btu2 * .10);
                        System.out.println("Room Area: " + 
                                                      roomSize);
                        System.out.println("Amount of Shade: " + 
                                                            btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                   finalbtu);
                       
           }
           else if(btu== abundantShade &&  roomSize > 500 && roomSize < 1000)
           {
               double finalbtu = btu3 - (btu3 * .10);
                        System.out.println("Room Area: " + 
                                                      roomSize);
                        System.out.println("Amount of Shade: " + 
                                                            btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                   finalbtu);
                        
           }
           else if(btu == abundantShade && roomSize >= 1000)
           {
              double finalbtu = btu4 - (btu4 * .10);
                        System.out.println("Room Area: " + 
                                                      roomSize);
                        System.out.println("Amount ofSshade: " + 
                                                            btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                   finalbtu);
                        
                          }
           
           
           
           if(btu == moderateShade && roomSize < 250 )
            {
            
                  double finalbtu = btu1;
                        System.out.println("Room Area: " +
                                                       roomSize);
                        System.out.println("Amount of Shade: " +
                                                             btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                finalbtu);
               }
              else if(btu == moderateShade && roomSize >= 250 && roomSize < 500)
              {
                  double finalbtu = btu;
                        System.out.println("Room Area: " +
                                                       roomSize);
                        System.out.println("Amount of Shade: " +
                                                             btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                finalbtu);
              }
              else if(btu == moderateShade &&  roomSize > 500 && roomSize < 1000)
              {
                  double finalbtu = btu3;
                        System.out.println("Room Area: " +
                                                       roomSize);
                        System.out.println("Amount of Shade: " +
                                                             btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                finalbtu);
              }
              else if(btu == moderateShade && roomSize >= 1000)
              {
                  double finalbtu = btu4;
                        System.out.println("Room Area: " +
                                                       roomSize);
                        System.out.println("Amount of Shade: " +
                                                             btu);
                        System.out.println("BTU's per Hour needed: " +
                                                                finalbtu);
                  
                  
           
            System.out.println("Air Conditioning Window Unit Cooling Capacity");
                        
                                   
                        
                    System.exit(0);    
                        
       } 
   }
           
           
}
