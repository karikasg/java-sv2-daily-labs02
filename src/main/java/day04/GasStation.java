package day04;

public class GasStation {
    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tanking(Car car, int tankedGasoline){
        car.setTank(tankedGasoline);
        return tankedGasoline*price;
    }
}
