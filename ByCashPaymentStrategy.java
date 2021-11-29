public class ByCashPaymentStrategy implements PaymentStrategy {

    public void pay(String amount) {
        System.out.println("order successfull!!!\ntotal amount " + amount + "Birr. by Cash");
    }

}