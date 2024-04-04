public class BankAccount implements Comparable {
    private double balance;
    public int compareTo(Object otherObject){
        BankAccount other = (BankAccount) otherObject;
        if(balance<other.balance) {
            return -1;
        }
        if(balance>other.balance){
            return 1;
        }
        return 0;
    }
    public String  toString(){
        return "BankAccount[balance=" + balance + "]";
    }
    
}