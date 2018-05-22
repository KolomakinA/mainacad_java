public class Lab247 {
    public static void main(String[] args) {
        GravityCalculator gravityCalculator = new GravityCalculator();
        System.out.println(gravityCalculator.calcDist(10));
    }
}

public class GravityCalculator {
    private static final double ACCELERATION = -9.81;

    public double calcDist(double finalTime){
        double distance = 0;
        double v = 0;
        for (int time = 0; time < finalTime; time++) {
            v = v + ACCELERATION;
            distance = 0.5 * ACCELERATION * Math.pow(time, 2) + v * time + distance;
        }
        return distance;
    }
}
