public class Car {
    int carGasAmount;
    int capacity;

    public Car() {
        this(0, 100);
    }
    public Car(int GasAmount, int capacity){
        this.carGasAmount = GasAmount;
        this.capacity = capacity;
    }
}