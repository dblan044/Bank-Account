public class Main { 
    public static void main(String[] args) {
        Bank acc = new Bank(999999, 500, "Diana", "db#gmail.com", 1234567890);
        
        System.out.println("Account Number: " + acc.getAccNum());
        System.out.println("Current Balance: $" + acc.getBalance());
        System.out.println("Username: " + acc.getName());
        System.out.println("User email: " + acc.getEmail());
        System.out.println("User #: " + acc.getPhoneNumber());
        System.out.println();
        
        System.out.println("Depositing $500...");
        acc.deposit(500);
        System.out.println();
        
        System.out.println("Withdrawing $500...");
        acc.withdraw(500);
        acc.withdraw(600);
    }
}
