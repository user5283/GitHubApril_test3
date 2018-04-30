/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketingsystem;


import java.util.Timer;
import java.util.TimerTask;


public class TicketingSystem {

    
    public static void main(String[] args) {
     
 
        Timer timer = new Timer();
        timer.schedule(new SalesAssisstantTask(), 0, 5000); //run code in the SalesAssistantTask run() method every 3 seconds

    }
    public static class SalesAssisstantTask extends TimerTask { //inner class
       
        public void run() {
                
            System.out.println("Sales Assistant is ready to see the next customer."); 
             System.out.println("Sales Assistant is ready to see the next customer.");
              System.out.println("Sales Assistant is ready to see the next customer..");
            
            /*the rest of code to display the next customer in line, what number
            ticket is next in line and list all customers in a queue */
        }
    }
   
    
}
    

