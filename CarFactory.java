import java.util.Scanner;

public class CarFactory {
    public static void main(String[] args) {

        String type, color, amount = "0";
        Scanner obj = new Scanner(System.in);
        CarType carType = new CarType();
        Painting bodyColor = new Painting();

        System.out.println("order car type");
        System.out.println("1.Mini car\n2.Sport car\n3.other ");
        type = obj.nextLine();
        Car c1 = carType.getType(type);
        System.out.println("price of  " + c1 + "is = " + c1.getCost() + " birr.");

        System.out.println("Choose color");
        System.out.println("1.White\n2.Silver\n3.Black ");
        color = obj.nextLine();

        bodyColor.setColor(color);

        if (type.equals("1") && color.equals("1")) {
            Car white = new White(new MiniCar());
            System.out.println("cost to paint is  = " + white.getCost() + "birr");
            amount = Double.toString(white.totalCost());
        } else if (type.equals("1") && color.equals("2")) {
            Car silver = new Silver(new MiniCar());
            System.out.println("cost to paint is  = " + silver.getCost() + "birr");
            amount = Double.toString(silver.totalCost());
        } else if (type.equals("1") && color.equals("3")) {
            Car black = new Black(new MiniCar());
            System.out.println("cost to paint is  = " + black.getCost() + "birr");
            amount = Double.toString(black.totalCost());
        } else if (type.equals("2") && color.equals("1")) {
            Car white = new White(new CompactCar());
            System.out.println("cost to paint is  = " + white.getCost() + "birr");
            amount = Double.toString(white.totalCost());
        } else if (type.equals("2") && color.equals("2")) {
            Car silver = new Silver(new CompactCar());
            System.out.println("cost to paint is  = " + silver.getCost() + "birr");
            amount = Double.toString(silver.totalCost());
        } else if (type.equals("2") && color.equals("3")) {
            Car black = new Black(new CompactCar());
            System.out.println("cost to paint is  = " + black.getCost() + "birr");
            amount = Double.toString(black.totalCost());
        }

        System.out.println("How would you like to pay? :\n1.CreditCard\n2.DebitCard\n3.Cash");
        String paymentType = obj.nextLine();
        PaymentContext ctx = new PaymentContext();
        switch (paymentType) {
        case "1": {
            ctx.setPaymentStrategy(new CreditCardPaymentStrategy());

        }
            break;
        case "2": {
            ctx.setPaymentStrategy(new DebitCardPaymentStrategy());

        }
            break;
        case "3": {
            ctx.setPaymentStrategy(new ByCashPaymentStrategy());

        }
            break;
        }
        System.out.println("PaymentContext has :" + ctx.getPaymentStrategy());

        ctx.pay(amount);

    }
}
