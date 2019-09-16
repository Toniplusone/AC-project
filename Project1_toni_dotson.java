import java.util.Scanner;

public class Project1_toni_dotson
{  
  
   public static void main(String[] args)
   {
   
         
         double roomLength; //to hold the rooms length
         
         double roomWidth; //to hold the rooms width
        
         int shade; //to hold the rooms shade
         
         int capacity; //to hold AC capacity
        
         double extraCooling = btu + .15d;
         
         double lessCooling = btu - (btu * .90);
         
         
         
         //constants to hold menu choice
         final int littleShade = 1;
         final int moderateShade = 2;
         final int abundantShade = 3;
         
         //idk yet
          double btu1 = 5500;//sq feet under 250 = BTU/hr with moderate shade
          double btu2 = 10000;//sq feet >= 250 && <500 = BTU/hr with moderate shade
          double btu3 = 17500;//sq feet > 500 & sq feet < 1000 = BTU/hr with moderate shade
          double btu4 = 24000;//sq feet >= 1000 with moderate shade
         
         
         
         Scanner keyboard = new Scanner(System.in); //scanner object
         
         
         System.out.print("Enter the length of your room: ");
         roomLength = keyboard.nextDouble(); //reads users input
         
         System.out.print("Enter the width of your room: ");
         roomWidth = keyboard.nextDouble();
         
         //display menu
         System.out.println("How much shade does the room get?: ");
         
         System.out.println("1. Little Shade");
         
         System.out.println("2. Moderate Shade");
         
         System.out.println("3. Abundant Shade");
         
         
         System.out.print("\nEnter your choice: "); //Have user enter a number from the choices
         shade = keyboard.nextInt(); //reads users input
         
         //constants to hold the rooms area (roomSize)
          double roomSize = roomLength * roomWidth;
          
           //determine capacity of air conditioning unit
            if(roomSize < 250 )
            
                btu = btu1;
                
             if(roomSize >= 250 && roomSize < 500)
             
                  btu = btu2;
              
             if(roomSize > 500 && roomSize < 1000)
             
                  btu = btu3;
                
             if(roomSize >= 1000)
             
                  btu = btu4;
                  
                 
             
         System.out.println("Air Conditioning Window Unit Cooling Capacity");
                        
         switch (shade)
                  {
                        
                     case moderateShade:
                        System.out.println("Room size: " +
                                                       roomSize);
                        System.out.println("Amount of Shade: " +
                                                             shade);
                        System.out.println("BTU's per Hour needed: " +
                                                                btu);
                        break;
                        
                      case littleShade:
                        System.out.println("Room size: " +
                                                               roomSize);
                        System.out.println("Amount of shade: " + 
                                                                  shade);
                        System.out.println("BTU's per Hour needed: " + 
                                                                     extraCooling);
                        break;
                                                             
                        
                      case abundantShade:
                        System.out.println("Room size: " + 
                                                      roomSize);
                        System.out.println("Amount of shade: " + 
                                                            shade);
                        System.out.println("BTU's per Hour needed: " +
                                                                   lessCooling);
                        break;
                        
                        
                        }
                        
                        
                        System.exit(0);
                   }

               } 
            
          
          
          
          
          
          
          
         
      
         
        
   
