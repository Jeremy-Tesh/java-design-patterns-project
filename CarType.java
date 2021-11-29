public class CarType {

    public Car getType(String choice) {
        switch (choice) {
        case "1":
            return new MiniCar();

        case "2":
            return new CompactCar();

        default:
            return null;
        }
    }
}
