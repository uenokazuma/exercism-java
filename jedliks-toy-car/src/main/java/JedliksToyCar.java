public class JedliksToyCar {

    private int remainingBattery = 100;
    private int distance = 0;

    public static JedliksToyCar buy() {
        JedliksToyCar jedlikToyCar = new JedliksToyCar();

        return jedlikToyCar;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if (remainingBattery == 0) {
            return "Battery empty";
        } else {
            return String.format("Battery at %d%%", remainingBattery);
        }
    }

    public void drive() {
        if (remainingBattery > 0) {
            remainingBattery -= 1;
            distance += 20;
        }
    }
}
