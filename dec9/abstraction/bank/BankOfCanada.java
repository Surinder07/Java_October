package dec9.abstraction.bank;

public abstract class BankOfCanada {

    public abstract void withdraw();
    public abstract void deposit();
    public abstract void transfer();
    public abstract void interstCharges();

    public void authority(){
        System.out.println("Only Bank of canada decidies how banks should operate");
    }

}
