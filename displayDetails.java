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
 * @author Kartik Mittal
 */
public class displayDetails extends User{
 
    public static void main(String args[]) {
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
      System.out.println("Deserialized User...");
      System.out.println("Name: " + u.name);
      //System.out.println("Address: " + e.address);
      System.out.println("cardno:"+u.cardno);
      System.out.println("PIN: " + u.pin);
      System.out.println("Balance: " + u.balance);
    }
}
