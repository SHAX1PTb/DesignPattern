package Creational.Singleton;


public class Client {

    public static void main(String[] args) {
        main.java.Creational.Singleton.Singleton singleton = main.java.Creational.Singleton.Singleton.getInstance();
        main.java.Creational.Singleton.Singleton singleton1 = main.java.Creational.Singleton.Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
