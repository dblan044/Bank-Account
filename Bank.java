
public class Bank {
    private int accNum;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    public Bank(int accNum, int balance, String name, String email, int phoneNumber) {
        this.accNum = accNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public void deposit(double deposit){
        balance += deposit;
        System.out.println("New Balance after deposit: $" + balance);
    }
    
    public void withdraw(double withdraw){
        if(balance - withdraw < 0){
            System.out.println("Insufficient Funds");
        }else{
            balance -= withdraw;
            System.out.println("New Balance after withdrawal: $" + balance);
        }
    }

    public int getAccNum() {
        return accNum;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
