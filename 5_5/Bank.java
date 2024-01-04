public class Bank {
    private Account account;

    public Bank(Account a) {
        account = new Account(a.getSaving());
    }

    public Account getAccount() {
        return account;
    }

    public void addMoney(double n) {
        account.addMoney(n);
    }
}
