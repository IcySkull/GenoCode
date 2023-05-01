import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeInput {
    final int NO_INPUT = 0;
    final int USER_INPUT = 1;
    final int FILE_INPUT = 2;
    Maze construct;
    public MazeInput(int inputType) throws FileNotFoundException {
        if(inputType==USER_INPUT)construct = new Maze(inputMazeBuilder());
        if(inputType==FILE_INPUT)construct = new Maze(fileMazeBuilder());
        if(inputType==NO_INPUT)construct = new Maze(defaultMazeBuilder());
    }
    public MazeInput(int[][] prebuilt){
        construct = new Maze(prebuilt);
    }

    public int[][] defaultMazeBuilder(){

        return null;
    }

    public int[][] inputMazeBuilder(){
        Scanner input = new Scanner(System.in);
        System.out.println("input number of rows: ");
        int rows = input.nextInt();
        System.out.println("input number of columns: ");
        int cols = input.nextInt();
        int[][] currentMaze = new int[rows][cols];
        System.out.println("input 1 or 0 \n times = " + rows*cols);
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                currentMaze[i][j] = input.nextInt();
            }
        }

        return null;
    }

    public int[][] fileMazeBuilder() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("input file name: ");
        Scanner fileReader = new Scanner(new File(""+input.next()));

        return null;
    }
}
