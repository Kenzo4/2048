import java.util.Random;

public class Main {
    public static void main(String[] args) {
        initFields();
        createInitialCells();

        while(!endOfGame){
            input();
            logic();

            graphicModule.draw(gameField);
        }
        graphicModule.destroy();
    }
    //Create on the field initial cells
    private static void createInitialCells(){
        for(int i = 0; i < COUNT_INITIAL_CELLS; i++){
            generateNewCells();
        }
    }
    private static void generateNewCells(){
        int state = (new Random().nextInt())
    }
}
