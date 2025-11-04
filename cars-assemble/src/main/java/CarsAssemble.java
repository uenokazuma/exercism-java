public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double cars = 0.0;
        int carsEachHours = 221 * speed;

        if (speed > 0 && speed < 5) {
            cars = carsEachHours;
        } else if (speed > 4 && speed < 9) {
            cars = (double) (carsEachHours * 90) / 100;
        } else if (speed == 9) {
            cars = (double) (carsEachHours * 80) / 100;

        } else if (speed == 10) {
            cars = (double) (carsEachHours * 77) / 100;
        }

        return cars;
    }

    public int workingItemsPerMinute(int speed) {
        int cars = (int) productionRatePerHour(speed) / 60;
        return cars;
    }
}
