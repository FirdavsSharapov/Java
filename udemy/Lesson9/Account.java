package udemy.Lesson9;

public class Account {
    private int accountNumber;
    private int accountBalance;
    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
    private String dateOfBirth;

    // public Account(int accNum, String fName, String lName, String addr, int pNumber, String dob) {
    //     accountNumber = accNum;
    //     firstName = fName;
    //     lastName = lName;
    //     address = addr;
    //     phoneNumber = pNumber;
    //     dateOfBirth = dob;
    // }

    // setup getters and setter
    
    // Account
    int getAccountNumber() {
        return accountNumber;
    }
    void setAccountNumber(int accNum) {
        if (accountNumber > 0) {
            accountNumber = accNum;
        } else {
            accountNumber = 0;
        }
    }

    // Balance
    int getAccountBalance(){
        return accountBalance;
    }
    void setAccountBalance(int balance){
        accountBalance = 0;
    }






}
