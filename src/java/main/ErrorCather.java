package main;

public class ErrorCather {
     public static void cellCreationFailure(){
         System.err.println("Main was failed to create new cell");
         System.exit(-1);
     }
}
