import javax.naming.directory.InvalidAttributesException;

public class BankAcount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAcount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance = balance + amount;

            System.out.println("Deposit Amount:" + amount);
            System.out.println("Balance after Deposit:" + balance);
        }
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;

            System.out.println("Withrawal Amount:" + amount);
            System.out.println("Balance after withdrawl:" + balance);
        }
    }

    public void getAccountNumber() {

        System.out.println("Your Account Number:" + accountNumber);

    }

    public void getAccountHolder() {
        System.out.println("Your Account Name:" + accountHolder);

    }

    public void getBalance() {
        System.out.println("Your Current Balance:" + balance);
    }

    public static void main(String[] args) {
        BankAcount bank = new BankAcount(10101022, "Temam", 19000);
        // deposit
        bank.deposit(2000);
        // withdrawal
        bank.withdrawal(1000);
        // getAccountNumber
        bank.getAccountNumber();
        // getAccount Holder
        bank.getAccountHolder();
        // getBalance
        bank.getBalance();

    }

}
