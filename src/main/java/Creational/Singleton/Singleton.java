package main.java.Creational.Singleton;

public class Singleton {

    private static Singleton lazyInitilization = null;
//    private static Singleton initalizeSingleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (lazyInitilization == null) {
            synchronized (Singleton.class) {
                if (lazyInitilization == null) {

                    lazyInitilization = new Singleton();
                }
            }
        }

        return lazyInitilization;
//        return initalizeSingleton;
    }
}
