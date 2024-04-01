package Generics;

public class GenericClass <T> implements JavaGenericInterface<T>{

    T name;
    @Override
    public void setName(T name) {
        this.name = name;

    }

    @Override
    public T getName() {
        return name;
    }

    public static void main(String[] args) {
        GenericClass<Double> user = new GenericClass<>();
        user.setName(998.855);
        System.out.println("My name is " + user.getName());

    }
}
