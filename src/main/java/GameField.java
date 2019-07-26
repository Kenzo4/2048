public class GameField {
    //State of all cells field
    private int[][] theField;

    //Initialize field and fill it zero values
    public GameField(){
        theField = new int[COUNT_CELLS_X][Constant.COUNT_CELLS_Y];
        for(int i = 0; i < theField.length; i++){
            for(int j = 0; j < theField[i].length; i++){
                theField[i][j] = 0;
            }
        }
    }

    //Return state of cells by coordinates
    public int getState(int x, int y){
        return theField[x][y];
    }

    //Change state of cells by coordinates
    public void setState(int x, int y, int state){
        theField[x][y] = state;
    }

    //Change column by number "i"
    public void setColumn(int i, int[] newColumn){
        theField[i] = newColumn;
    }

    //Return column by number "i"
    public int[] getColumn(int i){
        return theField[i];
    }

    //Change field by number i
    public void setLine(int i, int[] newLine){
        for(int i = 0; i < COUNT_CELLS_X; i++){
            theField[j][i] = newLine[j];
        }
    }
    //Return array of cells state by number "i"
    public int[] getLine(int i){
        int[] ret = new int[COUNT_CELLS_X];

        for(int j = 0; j < COUNT_CELLS_X; j++){
            ret[j] = theField[j][i];
        }
        return ret;
    }
}
