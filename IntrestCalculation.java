// Create a class Account with below attributes int id
// double balance double interestRate
// Class should have getters, setters and constructor witk parameters in above sequence of attributes
// create a class Solution with main method. Read one intege and two double values using Scanner object and create object of Account class. These values should be mapped to id, balance and interestRate attributes
// Read one more integer value and store it in variable noOfYears.
// Write a method calculatelnterest which will take account object and no of years as input parameters anckreturn the interest amount
// Consider below logic to calculate the interest value
// • For specified no of years, first find out the percentage value those no of years based on specified interest Rate, E.g. if no of vears is 5 and specified interestRate is 4%. then 4% of 5 is 0.2. ◦ This percentage should be added to original interstRate for calculating the final interest value, Hence for above example it will be 4.2 (instead of 4)
// Display the interest amount rounded upto three decima places. Even if the result does not have decimal, it should be displayed with suffix ".000".
// Consider below sample input and output
// Input: 1
// 1000
// 10 
// 5
// Output: 105.000
// Pr. Pr: pri
// Output is 55 since the interest rate is 10 and no of years is 5. Hence, the final interest will be 10 + 10 percentage of 5, which ls 10.5, Honco final answer ia 105.000

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
