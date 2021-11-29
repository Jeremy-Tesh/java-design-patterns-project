public class DebitCardPaymentStrategy implements PaymentStrategy {

    public void pay(String amount) {
        System.out.println("order successfull!!!\ntotal amount " + amount + "birr by Debit Card");
    }

}