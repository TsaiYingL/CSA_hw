public class Sandwich
{
    private int sandwichNum;
    private Vegetable veggie;
    private String meatType;

    public Sandwich(int sandwichNum, Vegetable veggie, String meatType)
    {
        this.sandwichNum = sandwichNum;
        this.veggie = veggie;
        this.meatType = meatType;
    }

    public Sandwich(){
        this.sandwichNum = 0;
        Vegetable none = new Vegetable();
        this.meatType = "air";
    }

    public void setMeatType(String meat)
    {
        meatType = meat;
    }

    public void veggieExist()
    {
        veggie.veggieExist();
    }

    public boolean isVeggieAdded()
    {
        return veggie.isVeggieAdded();
    }
}