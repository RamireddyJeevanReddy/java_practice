// OM SAI RAM //
public class Acount {
    private int acountnumber;
    private int balance;
    private String name;
    private String email;
    private long phonenumber;

    public void setAcountnumber(int acountnumber) {
        this.acountnumber = acountnumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public int getAcountnumber() {
        return acountnumber;
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
    public long getPhonenumber() {
        return phonenumber;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }
    public void withdraw(int amount){
        if(balance-amount>=0) {
            balance = balance - amount;
        }
        else{
            System.out.println("No suffecient amount");
        }
    }
}
