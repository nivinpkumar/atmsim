/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulaton.Enter;

import java.util.Scanner;

/**
 *
 * @author Kartik Mittal
 */
public class User  implements java.io.Serializable {
    public String name;
    public String cardno;
    public int pin;
    public int balance;
    public void setdata(){
        System.out.println("enter the name,cardno,pin,balance");
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        cardno=s.nextLine();
        pin=s.nextInt();
        balance=s.nextInt();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void getdata() {
        System.out.println("entered details are");
        System.out.println("name="+name);
        System.out.println("cardno="+cardno);
        System.out.println("pin="+pin);
        System.out.println("balance="+balance);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

