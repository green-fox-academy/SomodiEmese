public class Plants {
    protected String color;
    protected double waterAmount;
    protected double absorption;

    public Plants(String color, double waterNeed, double absorption) {
        this.color = color;
        this.waterAmount = waterNeed;
        this.absorption = absorption;
    }

    public void watering(double water) {
        this.waterAmount += water * absorption;
    }
}