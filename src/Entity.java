public class Entity {
    private int x;
    private int y;
    private char repres;

    public Entity(int x, int y, char repres) {
        this.x = x;
        this.y = y;
        this.repres = repres;

    }

    public int getCoordinateX() {
        return x;
    }

    public int getCoordinateY() {
        return y;
    }

    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public char getRepres() {
        return repres;
    }

    public void setRepres(char repres) {
        this.repres = repres;
    }

}
