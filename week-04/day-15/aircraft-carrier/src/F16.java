public class F16 extends Aircraft {
    private int ammo;

    public F16(){
        super("F16",8,30);

    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int maxAmmo) {
        if (ammo <= 8) {
            throw new IllegalArgumentException("too much ammo");
        }
    }
}
