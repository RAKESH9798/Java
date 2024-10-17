class SimpleATM extends ATM {

    SimpleATM(double intialBalance){
        super(intialBalance);
    }

    public void credit(double amount){
        try {
            if(amount<=0){
                System.out.println("Invalid input");
            }else{
                System.out.println("Your transaction is completed successfully. Your current balance "+(getBalance()+amount));
            }
        } catch (Exception e) {
            System.out.println("Error occured during transaction"+e);
        }
    }

    public void debit(double amount){
        try {
            if(amount>getBalance()){
                System.out.println("Insufficient funds");
            }else{
                System.out.println("Your transaction is completed successfully. Your current balance "+(getBalance()-amount));
            }
        } catch (Exception e) {
            System.out.println("Error occured during transaction"+e);
        }
    }

    public void checkBalance(){
        System.out.println("Your available balance is "+getBalance());
    }
}
