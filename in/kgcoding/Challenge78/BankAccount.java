package in.kgcoding.Challenge78;

 class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void displayAccountDetail(){
        System.out.println("Account Holder:"+ accountHolderName);
        System.out.println("Account Number:"+ accountNumber);

    }
    public void depositMoney(double money){
        if(money<=0){
            System.out.println("Invalid Deposit");
        }else{
        balance+=money;
        }
    }
    public double withdrawMoney(double money){
         if(money<=0){
            System.out.println("Invalid Withdraw");
        return money;

        }
        else if(balance>=money){
        balance-=money;
        return money;

        }else{
            System.out.print("You can Only withraw: ");
            return balance;
        }
        
    }

}
