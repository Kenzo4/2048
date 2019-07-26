package keyboard;

public interface KeyboardHandleModule {

    void update();

    main.Direction lastDirectionPressed();

    boolean wasEcsPressed();
}
