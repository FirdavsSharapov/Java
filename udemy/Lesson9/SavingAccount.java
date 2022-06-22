package udemy.Lesson9;

public class SavingAccount extends Account {

    public void depositToAccount(int deposit) {
        int currentBalance = getAccountBalance();
        setAccountBalance(currentBalance + deposit);
    }

    public void withdrawFromAccount(int withdraw) {
        int currentBalance = getAccountBalance();
        if (currentBalance < withdraw) {
            System.out
                    .println("You don't have enough money in your account. \n Your balace is: " + getAccountBalance());
        }else{
            setAccountBalance(currentBalance - withdraw);
        }
    }

}
