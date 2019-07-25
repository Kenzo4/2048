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
}
