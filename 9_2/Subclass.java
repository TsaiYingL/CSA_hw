class Subclass extends Superclass {
    private int subVariable;

    public Subclass() {
        super();
        subVariable = 0;
        System.out.println("Subclass no-argument constructor called.");
    }

    public Subclass(int superVariable, int subVariable) {
        super(superVariable);
        this.subVariable = subVariable;
        System.out.println("Subclass parameterized constructor called with subVariable: " + subVariable);
    }

    public Subclass(int subVariable) {
        this();
        this.subVariable = subVariable;
        System.out.println("Subclass overloaded constructor called with subVariable: " + subVariable);
    }

    public int getSubVariable() {
        return subVariable;
    }
}