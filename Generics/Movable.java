package Generics;

public interface Movable <T>{
    //abstract method one
    void move (T t, String locationCode);
    T getItemBeingMoved();


    //Abstract method three

    String getLocationBeingMovedTo();

}
