public class ShibaInu extends Dog {
    private String color;

    public ShibaInu(String color) {
        this.color = color;
    }

    public ShibaInu(String color, String size, int weight) {
        super(size, weight);
        this.color = color;
    }
}
