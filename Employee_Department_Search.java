/******************************************************************************
Employee Department Search

Create a Java program to store details of employees.

Create a class called Employee with these attributes:

id - Integer
name - String
department - String
salary - Integer

Create a constructor, getters, and setters for all attributes.

Task

Create a static method:

findEmployeesByDepartment()

This method should accept an array of Employee objects and a department name.

The method should find all employees who belong to the given department.

The department comparison should be case-insensitive. For example, IT, it, and It should be treated as the same department.

For every employee found, display:

id
name
salary

If no employee belongs to the given department, display:

No Employee Found
Input Format

First, take the number of employees.

For each employee, take:

id
name
department
salary

After entering all employees, take the department name that needs to be searched.

Sample Input
4
101
Priya
IT
50000
102
Rahul
HR
40000
103
Amit
IT
60000
104
Sneha
Sales
45000
IT
Sample Output
101
Priya
50000
103
Amit
60000
Test Case

Input:

3
1
Rahul
HR
40000
2
Priya
IT
50000
3
Amit
Sales
45000
Finance

Output:

No Employee Found
*******************************************************************************/
import java.util.Scanner;

class Employee{
    
   private int id ;
   private String name;
   private String department; 
   private double salary;
    
    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public void setters(int id){
        this.id = id;
    }
    public int getters(){
        return id;
    }
    
    public void setters_name(String name){
        this.name = name;
    }
    public String getters_name(){
        return name;
    }
    
    public void setters_departmet(String department){
        this.department = department;
    }
    public String getters_department(){
        return department;
    }
    
    public void setters_salary(double salary){
        this.salary = salary;
    }
    public double getters_salary(){
        return salary;
    }
    
}


public class Main
{
    public static void findEmployeesByDepartment(Employee arr[], String department){
        
        for(int i =0; i<arr.length; i++){
            if(arr[i].getters_department().equals(department)){
                System.out.println(arr[i].getters());
                System.out.println(arr[i].getters_name());
                System.out.println(arr[i].getters_department());
                System.out.println(arr[i].getters_salary());
            }
        }
    }
    
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   
	   Employee[] e = new Employee[n];
	   
	   for(int i =0; i<e.length; i++)
	   {
	       int id = sc.nextInt();
	       sc.nextLine();
	       String name = sc.nextLine();
	       String department = sc.nextLine();
	       double salary = sc.nextDouble();
	       
	       e[i] = new Employee(id, name, department, salary);
	   }
	   sc.nextLine();
	   findEmployeesByDepartment(e,sc.nextLine());
	   
	}
}
