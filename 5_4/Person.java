// Person.java
public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + '}';
    }
}
