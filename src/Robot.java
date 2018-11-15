public abstract class Robot {
    private Coordinate coordinate;
    private int fuelBar = 10;
    private char repres;
    private boolean lowBar = false;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getFuelBar() {
        return fuelBar;
    }

    public void setFuelBar(int fuelBar) {
        this.fuelBar = fuelBar;
    }

    public char getRepres() {
        return repres;
    }

    public void setRepres(char repres) {
        this.repres = repres;
    }

    public boolean isLowBar() {
        return lowBar;
    }

    public void setLowBar(boolean lowBar) {
        this.lowBar = lowBar;
    }

    public abstract void move();
}
