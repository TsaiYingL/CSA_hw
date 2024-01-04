/**
 * This is a class that represents a Person.
 */
public class Person {

    private String name;

    // Constructor to create a Person object
    public Person(String name) {
        this.name = name;
    }

    // @return The name of the person
    public String getName() {
        return name;
    }

    // Set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // A simple greeting
    public void sayHello() {
        System.out.println("Hello, my name is " + name + "!");
    }

}