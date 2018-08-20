public class BattleApp {
    public static void main(String[] args) {
        Ship ship01 = new Ship("Black Pearl");
        Ship ship02 = new Ship("T-tanic");

        ship01.fillShip();
        ship02.fillShip();

        ship01.status();
        ship02.status();

        ship01.battle(ship02);

        ship01.status();
        ship02.status();
    }
}
