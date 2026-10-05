package ObjectOrientedProgramming.Abstraction;

 abstract class Account{
     int accountNumber;
     String holderName;
     double balance;

     Account(int accountNumber, String holderName, double balance){
         this.accountNumber = accountNumber;
         this.holderName = holderName;
         this.balance = balance;
     }

     void deposit(double amount){
         balance += amount;
     }

     void displayInfo(){
         System.out.println("User Name: " + holderName);
         System.out.println("User account number: " + accountNumber);
         System.out.println("Available Balance: " + balance);
     }

     abstract void withdraw(double amount);

     abstract double calculateInterest();

 }

 class SavingsAccount extends Account{

     SavingsAccount(int accountNumber, String holderName, double balance) {
         super(accountNumber, holderName, balance);
     }

     @Override
     void withdraw(double amount) {
         if (balance - amount >= 1000){
             balance -= amount;
         }else{
             System.out.println("Insufficient Funds");
         }
     }

     @Override
     double calculateInterest() {
         return balance * 0.04;
     }
 }

 class CurrentAccount extends Account {
     CurrentAccount (int accountNumber, String holderName,double balance){
         super(accountNumber,holderName,balance);
     }

     @Override
     void withdraw(double amount) {
         if (balance - amount >= -5000){
             balance -= amount;
         }else{
             System.out.println("Limit Exceeds");
         }

     }

     @Override
     double calculateInterest() {
         return 0;
     }
 }

public class AbstractionExample {
   public static void main(String[] args) {

        Account a1 = new SavingsAccount(112233, "Om Locke",1000);
            a1.deposit(2000);
            a1.withdraw(500);

            a1.displayInfo();
        System.out.println("Interest: " + a1.calculateInterest());

       System.out.println();

        Account a2 = new CurrentAccount(556677, "vedant Strode",2000);
        a2.deposit(2000);
        a2.withdraw(500);

        a2.displayInfo();
        System.out.println("Interest: " + a2.calculateInterest());
        }
}


