import java.util.Scanner;
public class ElseIf {

	public static void main(String[] args) {
		int marks;
		System.out.println("Enter Student Marks:");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>80) {
			System.out.println("Topper");
			
		}
		else if(marks<80 && marks>=60){
			System.out.println("First");
			
		}else {
			System.out.println("Second");
			
		}
		
		

	}

}
