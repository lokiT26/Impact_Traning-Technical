class BankAccount {

    private double balance;
    public BankAccount(double initialBalance){
        if(initialBalance > 0){
            this.balance = initialBalance;
        } else{
            System.out.println("Enter Positive Amount.");
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        } else{
            System.out.println("Enter Positive Amount.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
        } else{
            System.out.println("Enter correct amount.");
        }
    }
    public void showBalance(){
        System.out.println(balance);
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);
        ba.deposit(10);
        ba.withdraw(500);
        ba.showBalance();
    }
}