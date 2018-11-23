public class Fuel extends Coordinate {
    private Coordinate coordinate;
    private char repres;
    private int x;
    private int y;

    public Fuel(int x, int y, char repres) {
        super(x,y,repres);
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public char getRepres() {
        return repres;
    }

    @Override
    public void setRepres(char repres) {
        this.repres = repres;
    }
}
