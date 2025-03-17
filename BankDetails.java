class BankAccount {
    private String accNo ;
    private int balance ;

    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
public class BankDetails {
    public static void main(String[] args) {
        BankAccount data = new BankAccount();

        data.setAccNo("4478906753");
        data.setBalance(10000);

        String accNo = data.getAccNo();
        int balance = data.getBalance();
        System.out.println("Acc No : " + accNo);
        System.out.println("Balance : " + balance);


    }
}
