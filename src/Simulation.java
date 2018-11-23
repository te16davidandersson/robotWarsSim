public class Simulation {
    public static void main(String[] args) {
        Board board = new Board();
        initBoard(board);
        //TODO: While loop med wait time mellan t.ex. thread.sleep eller timer
        board.printBoard();
    }

    public static void initBoard(Board board) {
        //TODO: fixa så att de inte kan skapas på samma x och y värden
        board.createFuel((int)Math.floor(Math.random()*8) + 1,(int)(Math.floor(Math.random()*8))+ 1);
        board.createSource((int)Math.floor(Math.random()*8) + 1,(int)(Math.floor(Math.random()*8))+ 1);
        board.createRobotLight((int)Math.floor(Math.random()*8) + 1,(int)(Math.floor(Math.random()*8))+ 1);
        board.createRobotDark((int)Math.floor(Math.random()*8) + 1,(int)(Math.floor(Math.random()*8))+ 1);
    }
}