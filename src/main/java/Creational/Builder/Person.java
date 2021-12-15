package main.java.Creational.Builder;

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String married;
    private String age;
    private String office;

    public Person firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person address(String address) {
        this.address = address;
        return this;
    }

    public Person married(String married) {
        this.married = married;
        return this;
    }

    public Person build() {
        return this;
    }

    public String getDetails() {

        return "person details name:" + firstName +" "+lastName;
    }
}
