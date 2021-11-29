public class White extends CarDecorator {
    public White(Car newCar) {
        super(newCar);
        System.out.println("painting car in progress to White.......");
    }

    public String getDescription() {
        return tempCar.getDescription() + "White";
    }

    public double getCost() {
        return 200;
    }

    public double totalCost() {
        return tempCar.getCost() + 200;
    }

}