package dec16.basicExceptions.bank;

public class Bank {

    double balance;
    //double withdraw;

    public double withdraw(double withdraw){

        if(balance < withdraw){
            throw new InsufficientsFundsException("Insufficient balance");
        }
        balance = balance - withdraw;
        return balance;

    }

    public double deposit(double deposit){

        balance = balance + deposit;
        return balance;
    }
    public double getBalance(){

        return balance;
    }



}
