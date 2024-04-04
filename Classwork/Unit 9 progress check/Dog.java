public class Dog extends Animal {
    private String size;
    private int weight;

    public Dog() {
        size = "mid";
        weight = 18;
    }

    public Dog(String size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public String bark() {
        return "woof";
    }

    public String getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
