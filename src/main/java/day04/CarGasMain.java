package day04;

public class CarGasMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        GasStation station = new GasStation(489);
        System.out.println(station.tanking(car1, 42)+" Ft-ért tankoltam");
        car1.setDistance(580);
        System.out.println("Átlagos fogyasztás: "+(car1.averageConsumption()*100)+" liter/100 km");
    }
}
