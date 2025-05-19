class bankAccount {
    private double balance = 1000.0;

    public void showDeposit() {
        System.out.println("Deposit: " + balance);
    }
}

public class Exc4 {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        account.showDeposit();
        // bankAccount.balance = 0; ERROR
    }
}