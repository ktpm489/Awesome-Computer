package in2018.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int flag;
        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.계좌생성 / 2.계좌목록 / 3.예금 / 4.출금 / 5.종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");

            flag = scanner.nextInt();

            if (flag == 1) {
                createAccount();
            } else if (flag == 2) {
                accountList();
            } else if (flag == 3) {
                deposit();
            } else if (flag == 4) {
                withdraw();
            } else if (flag == 5) {
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        }
    }

    //계좌생성하기
    private static void createAccount() {
        System.out.println("-------------------");
        System.out.println("계좌생성");
        System.out.println("-------------------");

        if (accounts.size() < 100) {
            String ano;
            String owner;
            int balance;

            System.out.print("계좌번호 : ");
            ano = scanner.next();
            System.out.print("계좌주 : ");
            owner = scanner.next();
            System.out.print("초기입금금액 : ");
            balance = scanner.nextInt();

            accounts.add(new Account(ano, owner, balance));
            System.out.println("결과: 계좌가 생성되었습니다.");
        } else
            System.out.println("계좌가 너무 많은데요?");
    }

    //계좌목록보기
    private static void accountList() {
        System.out.println("-------------------");
        System.out.println("계좌목록");
        System.out.println("-------------------");

        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }
    }

    //예금하기
    private static void deposit() {
        System.out.println("-------------------");
        System.out.println("예금");
        System.out.println("-------------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);

        if (account != null) {
            account.setBalance(account.getBalance() + money);
            System.out.println("결과: 예금이 성공되었습니다.");
        } else {
            System.out.println("계좌가 없어요");
        }
    }

    //출금하기
    private static void withdraw() {
        System.out.println("-------------------");
        System.out.println("출금");
        System.out.println("-------------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);

        if (account != null) {
            account.setBalance(account.getBalance() - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        } else {
            System.out.println("계좌가 없어요");
        }
    }

    //Account 배열에서 ano 와 동일한 Account 객체찾기
    private static Account findAccount(String ano) {
        for (Account account : accounts) {
            if (account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }

}

class Account {
    private String ano;     //계좌번호
    private String owner;   //계좌주
    private int balance;    //잔고

    Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountInfo() {
        return ano + " " + owner + " " + balance;
    }

    public String getAno() {
        return ano;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
