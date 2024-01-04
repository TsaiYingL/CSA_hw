public class Main {
    public static void main(String[] args) {
        Account veggie = new Account(100000000);
        Bank chase = new Bank(veggie);
        chase.addMoney(100000000);
        System.out.println(veggie.getSaving());
        System.out.println(chase.getAccount().getSaving());
    }
}
