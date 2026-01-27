import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter Your Age:");
		Scanner obj=new Scanner(System.in);
	    age = obj.nextInt();
	    
	    if(age>=18) {
	    	System.out.println("You are eligible for voting...");
	    }
	    
	    System.out.println("Checking age for voting...");
	    

	}

}
