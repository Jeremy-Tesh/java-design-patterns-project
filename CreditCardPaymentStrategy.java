public class CreditCardPaymentStrategy implements PaymentStrategy {

    public void pay(String amount) {
        System.out.println("order successfull!!!\ntotal amount " + amount + "birr by Credit Card");
    }

}