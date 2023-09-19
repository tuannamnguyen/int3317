package nam.week_2;

public class DummyTel {
    public static double totalCost(int hour, int minute, int second, int duration) {
        if (hour > 24 || minute > 60 || second > 60) {
            return -1;
        }

        double initialCost;

        if ((hour >= 18 && hour <= 24) || (hour >= 0 && hour <= 8)) {
            initialCost = duration * 0.5 * 0.5;
        } else {
            initialCost = duration * 0.5;
        }

        if (duration >= 60) {
            initialCost = initialCost * 0.85;
        }

        initialCost = initialCost * 1.05;

        return initialCost;
    }

    public static void main(String[] args) {
        int hour = 10;
        int minute = 30;
        int second = 0;
        int duration = 5;

        System.out.println(totalCost(hour, minute, second, duration));
    }
}
