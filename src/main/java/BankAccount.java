public class BankAccount {

    // Properties
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private int accountType;
    private int overdraft;

    // Constructor

    public BankAccount(String inputFirst, String inputLast, String inputDob, int inputAccount){
        this.firstName = inputFirst;
        this.lastName = inputLast;
        this.dateOfBirth = inputDob;
        this.accountNumber = inputAccount;
        this.balance = 0;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int addAmount){
        this.balance += addAmount;
    }

    public void withdrawal(int subtractAmount){
            this.balance -= subtractAmount;
    }

//   EXTENSION FOR PART 2
//    public Object withdrawal(int subtractAmount) {
//        if (this.balance > subtractAmount) {
//            this.balance -= subtractAmount;
//        }
//        return null;
//    }

    public void payInterest(double rate) {
        double interest = balance + rate / 100;
        balance += interest;
    }
}
