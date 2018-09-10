public class F35 extends Aircraft {
    private int ammo;

    public F35(){
        super("F35", 12, 50);
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int maxAmmo) {
        if (ammo <= 12) {
            throw new IllegalArgumentException("too much ammo");
        }
    }
}

