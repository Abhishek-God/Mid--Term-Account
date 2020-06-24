/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 * date: June 24
 * @author Sivagama
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 5 accounts can be created
        for the given bank*/ 
        Account[] ac=new Account[5];
        
        Scanner sc=new Scanner(System.in);
        double bal = 0;
            do{
                System.out.println("Please enter the amount by which you want to open an account:");
                System.out.println("Minimum amount is 50");
                bal = sc.nextDouble();
               } while(bal<50);
        
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user=sc.nextLine();
        /* modify the code to store 5 accounts in array and print balance and monthly Interest for the available balance */
        
        Account a=new Account(bal,user);
       
        System.out.println("The balance is: "+ a.getBalance());  
        System.out.println("The InterestRate per month is "+a.getInterestRate());
        System.out.println("The Amount after interest is "+a.balanceInterest());
        
    }
}
