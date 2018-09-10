public class Aircraft {
    protected int maxAmmo;
    protected int baseDamage;
    protected int ammo;
    protected String type;
    int damage;

    public Aircraft(String type, int maxAmmo, int baseDamage){
        this.maxAmmo= maxAmmo;
        this.baseDamage = baseDamage;
        this.ammo = maxAmmo;
        this.type = type;
        this.damage = maxAmmo * baseDamage;
    }

    public int fight(){
        ammo = 0;
        return damage;
    }

    public int refill(int number){
        return number - (maxAmmo -ammo);

    }

    public String getType(){
        return type;
    }

    public boolean isPriority(){
        if (type == "F16"){
            return false;
        }return true;
    }

    public String getStatus(){
        return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + damage + ".";
    }
}
