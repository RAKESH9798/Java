abstract class ATM {
    private double balance;

    public ATM(double amount){
        this.balance=amount;
    }

    protected double getBalance(){
        return balance;
    }

    protected void setBalance(double balance){
        this.balance=balance;
    }

    abstract void credit(double amount);
    abstract void debit(double amount);
    abstract void checkBalance();
}
