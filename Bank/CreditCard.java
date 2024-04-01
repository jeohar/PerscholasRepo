package Bank;

public class CreditCard extends BankAccount {


    private String ccNumber;

    public CreditCard(int accountNumber, double balance, String ccNumber) {
        super(accountNumber, balance);
        this.ccNumber = ccNumber;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance) >= amount) {
            balance -= amount;
            System.out.println("withdrawl successful: current balance = " + balance);
        } else {
            System.out.println("Withdraw failed: not enough funds");

        }

    }
//        gold > 105
//        silver > 80
//        sum = 105

    public static String tierCheck(String creditCardNumber) {
        String strippedCCNumber = creditCardNumber.replaceAll("[^\\d]", "");
        //we are going to breakdown credit card number

        long ccNumberLong = Long.parseLong(strippedCCNumber);

        int sum = 0;
        while (ccNumberLong > 0) {
            long lastDigit = ccNumberLong % 10; //%10 returns the last element
            sum += lastDigit;
            ccNumberLong = ccNumberLong / 10; // /10 removes the last digit
        }
            if (sum >= 80) {
                return "Plantinum";
            } else if (sum >= 60) {
                return "Gold";
            } else if (sum >= 40) {
                return "Silver";
            } else {
                return "Bronze";
            }
        }
    }









