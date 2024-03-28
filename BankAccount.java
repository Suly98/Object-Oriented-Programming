import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private Float balance;
    private String ownerName;

    public BankAccount(String accountNumber, Float balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number: ");
        String accountNumber = sc.next();

        System.out.println("Enter your balance: ");
        Float balance = sc.nextFloat();

        System.out.println("Enter your name: ");
        String ownerName = sc.next();

        BankAccount account = new BankAccount(accountNumber, balance, ownerName);

        System.out.println("Would you like to withdraw anything from you account? (y/n) ");

        if(sc.next().equalsIgnoreCase("y")){
            System.out.println("Please, enter the amount that you want to withdraw: ");
            Float amountWithdrawed = sc.nextFloat();

            if(amountWithdrawed>account.balance){
                System.out.println("No Sufficient Amount!!");
            }else{
                Float result = account.balance - amountWithdrawed;
                System.out.printf("Success, the remaining balance in your account is: " + result );

            }
        } else{
            System.out.println("Thanks for visiting our Bank! ");
        }
        sc.close();
    }
}

