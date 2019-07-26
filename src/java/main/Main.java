import main.Constants;
import main.ErrorCather;

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
        for(int i = 0; i < Constants.COUNT_INITIAL_CELLS; i++){
            generateNewCells();
        }
    }
    private static void generateNewCells(){
        int state = (new Random().nextInt(100)<=Constants.CHANGE_OF_LUCKY_SPAWN)
                ? Constants.LUCKY_INITIAL_CELL_STATE
                : Constants.INITIAL_CELL_STATE;

        int randomX, randomY;

        randomX = new Random().nextInt(Constants.COUNT_CELLS_X);
        int currentX = randomX;

        randomY = new Random().nextInt(Constants.COUNT_CELLS_Y);
        int currentY = randomY;

        boolean placed = false;
        while(!placed){
            if(gameField.getState(currentX, currentY) == 0){
                gameField.setState(currentX, currentY, state);
                placed = true;
            }else{
                if(currentX + 1 < Constants.COUNT_CELLS_X){
                    currentX++;
                }else{
                    currentX = 0;
                    if(currentY + 1 < Constants.COUNT_CELLS_Y){
                        currentY++;
                    }else{
                        currentY = 0;
                    }
                }

                if((currentX == randomX) && (currentY == randomY)){
                    ErrorCather.cellCreationFailure();
                }
            }
        }
    }
}
