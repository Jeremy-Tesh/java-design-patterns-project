public class Silver extends CarDecorator {
    public Silver(Car newCar) {
        super(newCar);
        System.out.println("painting car in progress to Silver.......");
    }

    public String getDescription() {
        return tempCar.getDescription() + "Silver";
    }

    public double getCost() {
        return 300;
    }

    public double totalCost() {
        return tempCar.getCost() + 300;
    }
}