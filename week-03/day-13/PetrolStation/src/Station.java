public class Station {
    int gasAmount = 1000;
    public void refill(Car car){
        int addedGasAmount = car.capacity - car.carGasAmount;
        car.carGasAmount += addedGasAmount;
        gasAmount-= addedGasAmount;
    }

    public static void main(String [] args){
        Car car01 = new Car(72, 214);
        Station station = new Station();

        station.refill(car01);
        System.out.println(car01.carGasAmount);
        System.out.println(station.gasAmount);
    }
}

