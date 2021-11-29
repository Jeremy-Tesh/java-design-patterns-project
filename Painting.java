public class Painting {

    public void setColor(String choice) {

        switch (choice) {
        case "1": {
            White white = new White(new MiniCar());
            white.getDescription();
            break;

        }

        case "2": {
            Silver silver = new Silver(new MiniCar());
            silver.getDescription();

        }
            break;

        case "3": {
            Black black = new Black(new MiniCar());
            black.getDescription();

        }
            break;

        default:
            System.out.println("null");
        }

    }

}
