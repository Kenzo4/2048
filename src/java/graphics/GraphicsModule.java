package graphics;

import main.GameField;

public interface GraphicsModule {

    void draw(GameField field);

    boolean isCloseRequest();

    void destroy();
}
