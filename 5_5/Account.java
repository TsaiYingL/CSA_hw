public class Account
{
  private double saving;
 
  public Account(double saving)
  {
    this.saving = saving;
  }
 
  public void addMoney(double money)
  {
    saving +=money;
  }
 
  public double getSaving()
  {
    return saving;
  }
}
