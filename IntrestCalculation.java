import java.util.Scanner;
class Account{
    private int id;
    private double balance;
    private double intrestRate;
    
    Account(int id, double balance, double intrestRate){
        this.id = id;
        this.balance = balance;
        this.intrestRate = intrestRate;
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getInt(){
        return intrestRate;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setInt(double intrestRate){
        this.intrestRate = intrestRate;
    }
}

public class Main
{
    static double calculation(Account ac, int no){
        double spi = no*(ac.getInt()/100);
        spi = ac.getInt() + spi;
        
        return ac.getBalance()*(spi/100);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int id = sc.nextInt();
	    double balance = sc.nextDouble();
	    double intrestRate = sc.nextDouble();
	    
	    
	    Account ac = new Account(id, balance, intrestRate);
	    
	    int no = sc.nextInt();
	    
	    System.out.printf("%.3f",calculation(ac,no));
	}
}
