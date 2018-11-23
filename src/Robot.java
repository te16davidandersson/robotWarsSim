public abstract class Robot extends Entity {
    private final static int FUELBAR = 10;
    private boolean lowBar = false;

    public Robot(int x, int y, char repres) {
        super(x, y, repres);
    }

    public boolean isLowBar() {
        return lowBar;
    }

    public void setLowBar(boolean lowBar) {
        this.lowBar = lowBar;
    }

    public abstract void move();
}
