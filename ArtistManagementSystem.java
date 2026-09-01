import java.util.Scanner;
import java.util.ArrayList;

class Artist{
    private int id ;
    private String name;
    private String Gener;
    private int sold;
    private double sale;
    
    Artist(int id, String name, String Gener, int sold, double sale){
        this.id = id;
        this.name = name;
        this.Gener = Gener;
        this.sold = sold;
        this.sale = sale;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getGener()
    {
        return Gener;
    }
    
    public int getSold()
    {
        return sold;
    }
    
    public double getSale()
    {
        return sale;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGener(String Gener){
        this.Gener = Gener;
    }
    public void setSold(int Sold){
        this.sold = Sold;
    }
    public void setSale(double Sale){
        this.sale = Sale;
    }
    
}
public class Main
{
    static int avarage(ArrayList<Artist> arr, String Gener){
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<arr.size(); i++){
            if(Gener.equals(arr.get(i).getGener())){
                sum += arr.get(i).getSold();
                count++;
            }
        }
        return sum/count;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     
	    ArrayList<Artist> ar = new ArrayList<Artist>();
	    
	    int n = sc.nextInt();
	   
	    
	    for(int i=0; i<n; i++){
	        
	        int id = sc.nextInt(); sc.nextLine();
	        String name = sc.nextLine();
	        String gener = sc.nextLine();
	        int sold = sc.nextInt(); 
	        double sale = sc.nextDouble();
	        
	        ar.add(new Artist(id,name,gener,sold,sale));
	    }
	    
	    sc.nextLine();
	    String gener = sc.nextLine();
	    
	    System.out.println(avarage(ar,gener));
	}
}
