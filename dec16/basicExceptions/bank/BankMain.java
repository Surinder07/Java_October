package dec16.basicExceptions.bank;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        double deposit = bank.deposit(1000);
        System.out.println("Total deposit amout is " + deposit);
        System.out.println("balance after withdrawl "+ bank.getBalance());

        bank.withdraw(2000);

        System.out.println("balance after withdrawl "+ bank.getBalance());



    }
}
