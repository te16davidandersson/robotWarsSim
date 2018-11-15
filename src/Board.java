import java.util.List;

public class Board {
    private int width;
    private int height;
    private List lights;
    private List fuel;
    private List robots;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List getLights() {
        return lights;
    }

    public void setLights(List lights) {
        this.lights = lights;
    }

    public List getFuel() {
        return fuel;
    }

    public void setFuel(List fuel) {
        this.fuel = fuel;
    }

    public List getRobots() {
        return robots;
    }

    public void setRobots(List robots) {
        this.robots = robots;
    }

    public static void main(String[] args) {
        
    }
}
