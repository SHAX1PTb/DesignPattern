package Creational.AbstractFactory;

public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {


        Laptop dell = LaptopFactory.getLaptop(Laptoptype.DELL);
        Laptop mac = LaptopFactory.getLaptop(Laptoptype.MAC);
        Laptop Hp = LaptopFactory.getLaptop(Laptoptype.HP);

        System.out.println(dell.getConfiguration());
        System.out.println(dell.toString());
    }
}
