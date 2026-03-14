import java.util.Scanner;
class BankAccount{
    String accountHolderName;
    double balance;
    BankAccount(String name, double bal){
        accountHolderName=name;
        balance=bal;}
void deposit(double amount){
    balance = balance + amount;
    System.out.println("Updated balance after deposit: " + balance);}
void withdraw(double amount){
    balance = balance - amount;
    System.out.println("Updated balance after withdrawal: " + balance);}
}
public class Bankacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder's name:");
        String name = sc.nextLine();
        System.out.println("Enter initial balance:");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(name, initialBalance);
        
        System.out.println("Enter amount to deposit:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        
        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        
        sc.close();
    }
} 