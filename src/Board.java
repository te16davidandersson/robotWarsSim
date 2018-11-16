import java.util.List;

public class Board {
    private int width = 10;
    private int height = 10;
    private List lights;
    private List fuel;
    private List robots;
    private char[] board;

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

    public char[] getBoard(){
        return board;
    }

    public void board() {
        board = new char[width*height];
         for(int i = 0; i<(height*width); i++){
            if (i % width == 0 || i % width + 1 == width || i / height == 0 || i / height + 1 == height) {
                this.board[i] = 'X';
            } else {
                this.board[i] = ' ';
            }
        }
    }

    public Board(){
        this.board();
    }

    public static void main(String[] args) {
        Board b = new Board();
        for(int i = 0; i<b.getHeight(); i++){
            String out = "";
            for(int k = 0; k<b.getWidth(); k++){
                out = out + b.getBoard()[k+i*b.getWidth()] + " ";
            }
            System.out.println(out);
        }

    }
}
