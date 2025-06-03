class BankAccount{
    void deposit(){
        System.out.println("Deposit.");
    }
    void withdraw(){
        System.out.println("Withdraw limits.");
    }
}
class SavingsAccount{
    void withdraw(){
        System.out.println("Withdraw limit is 30000 RS.");
    }
}
class CheckingAccount{
    void withdraw(){
        System.out.println("Withdraw limit is 50000 RS.");
    }
}

public class poly {
    public static void main(String[] args) {
        CheckingAccount obj = new CheckingAccount();
        obj.withdraw();
    }
}
