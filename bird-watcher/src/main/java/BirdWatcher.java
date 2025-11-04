
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {

        boolean withoutBird = false;

        for (int bird : this.birdsPerDay) {
            if (bird == 0) {
                withoutBird = true;
            }
        }

        return withoutBird;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int count = 0;
        for (int day = 0; day < numberOfDays; day++) {
            if (day > this.birdsPerDay.length - 1) {
                break;
            }

            count = count + this.birdsPerDay[day];
        }

        return count;
    }

    public int getBusyDays() {

        int count = 0;
        for (int bird : this.birdsPerDay) {
            if (bird >= 5) {
                count++;
            }
        }

        return count;
    }
}
