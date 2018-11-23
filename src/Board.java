import java.util.ArrayList;
import java.util.List;

public class Board {
    private final static int WIDTH = 10;
    private final static int HEIGHT = 10;
    private List<Light> lights;
    private List<Fuel> fuel;
    private List<Robot> robots;
    private char[] board;

    public Board(){
        this.createBoard();
        this.lights = new ArrayList<>();
        this.fuel = new ArrayList<>();
        this.robots = new ArrayList<>();
    }

    public void printBoard() {
        for(int i = 0; i<HEIGHT; i++){
            String out = "";
            for(int k = 0; k<WIDTH; k++){
                out = out + board[k+i*WIDTH] + " ";
            }
            System.out.println(out);
        }
    }

    public void createBoard() {
        board = new char[WIDTH*HEIGHT];
         for(int i = 0; i<(WIDTH*HEIGHT); i++){
            if (i % WIDTH == 0 || i % WIDTH + 1 == WIDTH || i / HEIGHT == 0 || i / HEIGHT + 1 == HEIGHT) {
                this.board[i] = 'X';
            } else {
                this.board[i] = ' ';
            }
        }
    }

    public void createFuel(int x, int y) {
        Fuel fuel = new Fuel(x, y);
        this.fuel.add(fuel);
        board[x + y*WIDTH] = fuel.getRepres();
    }
}
