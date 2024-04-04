public class Main {
    public static void main(String[] args) {
        /*
         * We can't instantiate a second class object in a third class reference because
         * a shiba inu can be a dog, but a dog might not be a shiba inu
         */
        // ShibaInu cat = new Dog("mid", 20);

        Dog cat = new ShibaInu("black");
        System.out.println(cat.bark());

        Animal animal = new Dog();
        /*
         * Not possible to call the second class method because the reference type is
         * Animal,
         * which does not have a method named bark()
         */
        // System.out.println(animal.bark());

        ShibaInu inu = new ShibaInu("white");
        /*
         * Not possible to call the second class method on this object directly, because
         * the
         * reference type is ShibaInu, which does not have a method named bark()
         */
    }
}
