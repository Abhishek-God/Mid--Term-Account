/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/** Improve the code by applying suitable design principles
 * date: June 24
 * @author Sivagama
 */
public class Account {

    
        private double balance;
        private double interestRate= 0.3;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            this.balance=initialBalance;
            this.user=givenUser;
            //To create an account the initial balance must be greater than 50.       
        }
        
        public double getInterestRate() {
        return interestRate;
        }
        
     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            this.balance=this.balance+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            this.balance=this.balance-amount;
        } 
        
        public double getBalance() {
        return balance;
        }
        
        public double balanceInterest(){
            double finalBalance = this.balance + this.balance*interestRate;
            return finalBalance;
        }
    
}//class end
