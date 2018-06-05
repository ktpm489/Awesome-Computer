package in2018.CustomException;

class BalanceInsufficientException extends Exception {
    BalanceInsufficientException(String message) {
        super(message);
    }
}

class Account {
    private long balance;

    Account() { }

    public long getBalance() {
        return balance;
    }

    void deposit(int money) {
        balance += money;
    }

    void withdraw(int money) throws BalanceInsufficientException {
        if(balance < money)
            throw new BalanceInsufficientException("잔고부족: " + (money - balance) + "이 모자람");
        balance -= money;
    }
}

public class CustomException {
    public static void main(String[] args) throws BalanceInsufficientException {
        Account account = new Account();
        account.deposit(100000);
        account.withdraw(1000);
        account.deposit(10000);
        account.withdraw(1000000);
        System.out.println(account.getBalance());
    }
}
