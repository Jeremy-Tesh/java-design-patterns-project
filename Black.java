public class Black extends CarDecorator {
    public Black(Car newCar) {
        super(newCar);
        System.out.println("painting car in progress Black......");
    }

    public String getDescription() {
        return tempCar.getDescription() + "Black";
    }

    public double getCost() {
        return 100;
    }

    public double totalCost() {
        return tempCar.getCost() + 100;
    }
}