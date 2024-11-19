package CampusExercise;

public class RunBank {
    public static void run() {
       Bank bank = new Bank();
       bank.setBalance(100_000);
       bank.deposit(100);
       bank.showInfo();
    }
}
