package main;

public class Constants {

    //Size of one cell
    public static final int CELL_SIZE = 64;

    //Number of cells on the screen by the horizontal and vertical
    public static final int COUNT_CELLS_X = 4;
    public static final int COUNT_CELLS_Y = 4;

    //Window option
    public static final int SCREEN_WIDTH = COUNT_CELLS_X * CELL_SIZE;
    public static final int SCREEN_HEIGHT = COUNT_CELLS_Y * CELL_SIZE;
    public static final String SCREEN_NAME = "2048";

    //In original game version there is a small change, that a tile
    //appears with a value not 2, but 4
    public static final int CHANGE_OF_LUCKY_SPAWN = 17;

    //State of new created cells
    public static final int LUCKY_INITIAL_CELL_STATE = 4;
    public static final int INITIAL_CELL_STATE = 2;

    //The number of cells determined by the users in first move
    public static final int COUNT_INITIAL_CELLS = 2;
}
