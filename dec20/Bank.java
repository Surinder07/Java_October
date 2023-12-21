package dec20;

public class Bank {

    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println(payment.getDebitCard());
        System.out.println(payment.getPayPal());
        System.out.println(payment.getCreditCard());
    }
}
