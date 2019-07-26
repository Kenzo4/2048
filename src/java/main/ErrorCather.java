package main;

public class ErrorCather {
     public static void cellCreationFailure(){
         System.err.println("Main was failed to create new cell");
         System.exit(-1);
     }

     public static void shiftFailureWrongProgram(){
         System.err.println("Main class failed to shift cells to field. Wrong parameter");
         System.exit(-2);
     }

     public static void graphicsFailure(){
         System.err.println("GraphicsModule failed");
         System.exit(-3);
     }
}
