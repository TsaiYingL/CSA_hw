public class Main {
    public static void main(String[] args) {

        Person Bob = new Person("Brooklyn", 18);
        Person Tom = new Person("Queens", 18);

        System.out.println(Bob.isSameAge(Tom));
        System.out.println(Bob.movPersonTo(Tom));
    }
}
