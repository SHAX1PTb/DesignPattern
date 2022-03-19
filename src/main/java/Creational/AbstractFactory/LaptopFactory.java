package Creational.AbstractFactory;

public class LaptopFactory {

    public static Laptop getLaptop(Laptoptype laptoptype) {
        switch (laptoptype){
            case DELL :
                return new Dell("25","Intel");
            case MAC:
                return new Mac("25","Mac");
            case HP:
                return new Hp("25","AMD");
        }
        return null;
    }
}
