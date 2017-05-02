/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulaton.display;
import atmsimulaton.Enter.User;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author windows 8
 */
public class GetInfo extends User {
    public void getCardno() {
        User u = null;
        try
      {
         FileInputStream fileIn = new FileInputStream("User2.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         u = (User) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("User class not found");
         c.printStackTrace();
         return;
      }
        System.out.println("cardno is "+u.cardno);
    }
    public void getPin(){
        User u = null;
        try
      {
         FileInputStream fileIn = new FileInputStream("User2.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         u = (User) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("User class not found");
         c.printStackTrace();
         return;
      }
        System.out.println("pin is "+u.pin);
    }
    
        
        public static void main(String args[]){
            GetInfo g = new GetInfo();
            g.getCardno();
            g.getPin();
        }
}


