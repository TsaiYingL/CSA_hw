public class Person {
    private String address;
    private int age;

    public Person(String a, int age) {
        this.address = a;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person movPersonTo(Person p) {
        return new Person(p.getAddress(), age);
    }

    public boolean isSameAge(Person other) {
        return age == other.age;
    }
}
