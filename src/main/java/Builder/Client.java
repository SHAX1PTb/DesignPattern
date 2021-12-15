package main.java.Builder;

public class Client {

    public static void main(String[] args) {
        Person person = new Person().firstName("Shankar").lastName("Annigeri").build();
        System.out.println(person.getDetails());


    }


}
