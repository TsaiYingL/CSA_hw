// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating an Address object
        Address address = new Address("123 Main St", "Cityville");

        // Creating a Person object with the Address object
        Person person = new Person("John Doe", address);

        // Printing the return value of the accessor method that returns a mutable
        // object
        System.out.println("Original Address: " + person.getAddress());

        // Modifying the mutable object
        address.setStreet("456 Oak St");
        address.setCity("Townsville");

        // Printing the modified Address using the accessor method
        System.out.println("Modified Address: " + person.getAddress());
    }
}
