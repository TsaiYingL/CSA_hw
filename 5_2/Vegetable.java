public class Vegetable
{
    private boolean veggieExist;
 
    public Vegetable(boolean v){
        this.veggieExist = v;
    }

    public Vegetable(){
        this.veggieExist = false;
    }
 
    public void veggieExist()
    {
        veggieExist = true;
    }

    public boolean isVeggieAdded()
    {
        return veggieExist;
    }
}