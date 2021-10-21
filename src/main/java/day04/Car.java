package day04;

public class Car {
    private int tank;
    private int distance;

    public void setTank(int tank) {
        this.tank = tank;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double averageConsumption() {
        return (double) tank / distance;
    }
}
