public class Customer {
    private String neme;
    private int creditLimit;
    private String email;

    public Customer(String neme, int creditLimit, String email) {
        this.neme = neme;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Rami",50000,"Rami@email.com");
    }

    public Customer(String neme, String email) {
        this(neme,50000,email);
    }

    public String getEmail() {
        return email;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getNeme() {
        return neme;
    }
}
