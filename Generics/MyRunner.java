package Generics;

public class MyRunner {
    public static void main(String[] args) {
        ElephantItem<Integer> objMove = new ElephantItem<>();
        objMove.move(5,"NYC");

        System.out.println(objMove.getItemBeingMoved() + " Item");
        System.out.println(objMove.getLocationBeingMovedTo() + " Location");



    }
}
