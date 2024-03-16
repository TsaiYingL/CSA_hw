public class Superclass {
    private int num;

    public Superclass(int num) {
        this.num = num;
    }

    public boolean equals(Superclass obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Superclass other = obj;
        return num == other.num;
    }

    public String toString() {
        return "Superclass = " + num;
    }

    public void print() {
        System.out.println("Super");
    }
}
