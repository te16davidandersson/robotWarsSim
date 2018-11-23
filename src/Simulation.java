public class Simulation {
    public static void main(String[] args) {
        Board board = new Board();
        board.createFuel((int)Math.floor(Math.random()*8) + 1,(int)(Math.floor(Math.random()*8))+ 1);
        board.printBoard();
    }
}
