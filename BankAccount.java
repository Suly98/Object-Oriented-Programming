import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private Float balance;
    private String ownerName;

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
        BankAccount account = new BankAccount();

        System.out.println("Enter your account number: ");
        account.accountNumber = sc.next();

        System.out.println("Enter your balance: ");
        account.balance = sc.nextFloat();

        System.out.println("Enter your name: ");
        account.ownerName = sc.next();

        System.out.println("Would you like to withdraw anything from you account? (y/n) ");

        if(sc.next().equals("y")){
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

    }
}

