public class BankAccount {
    int account;
    double balance;

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        SavingsAccount sa = new SavingsAccount();
        COD cd = new COD();

        ca.limit = 12;
        sa.rate =2;

        System.out.println(sa.rate);
    }
}

class CheckingAccount extends BankAccount {
    int limit;
}

class SavingsAccount extends BankAccount {
    int rate;
}

class COD extends BankAccount {
    int limit;
}
