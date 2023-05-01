public class Maze {
    int[][] maze = new int[0][0];
    final int LEFT = 6;
    final int UP = 7;
    final int RIGHT = 8;
    final int DOWN = 9;
    final int OPEN = 0;
    final int CLOSED = 1;

    public Maze(int[][] maze){
        this.maze = maze;
    }

    public String mazeToString(){
        String mazeBuilder = new String("");
        for(Integer row = 0;row<maze.length;row++){
            for(Integer col = 0; col<maze[row].length;col++){
                if(col==0)mazeBuilder+="[ ";
                if(col==maze[row].length-1)mazeBuilder+= maze[row][col]+" ]";
                mazeBuilder+= maze[row][col]+", ";
            }
        }
        return mazeBuilder;
    }
}
