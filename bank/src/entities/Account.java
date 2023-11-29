package entities;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(int  number, String name) {
        this.number = number;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw - 5;
    }

    public String toString(){
        String balance = String.format("%.2f", getBalance());
        String name = String.format(getName());

        return "Account: " + getNumber() +
                ", Holder: " + name +
                ", Balance: " + balance + "\n";



    }


}
