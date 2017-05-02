/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulaton.Enter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Kartik Mittal
 */

public class storeDetails extends User {

    
    public static void main(String args[]) throws IOException{
        User d = new User();
        /*d.name="npk";
        d.balance=1000;
        d.pin=3242;*/
        d.setdata();

         FileOutputStream fileOut = new FileOutputStream("User2.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(d);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in User2.txt");
         
     
    }

        
}

