package Bank;

public class CheckAccount extends BankAccount {
    private double overDraftLimit;

    public CheckAccount(int accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }


    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && (balance + overDraftLimit) >=amount){
            balance -= amount;
            System.out.println("withdrawl successful: current balance = " +balance);
        }else{
            System.out.println("Withdraw failed: not enough funds");

        }
    }
}
