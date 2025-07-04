package bankApp;

public class Account {
    private int balance;
    private String pin;
    public Account() {
        balance = 0;
        pin = "correctPin";
    }
    public void deposit(int amount, String pin){
        if(amount > 0) balance += amount;
    }
    public int getBalance(String password) {
        if(password.equals(pin)) return balance;
        return 0;
    }
    public void withdrawal(int amount, String pin) {
        if(amount > 0 && amount <= balance && pin.equals(this.pin)) balance = balance - amount;
    }
}
