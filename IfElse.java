import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Number:");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		if(num>=0) {
			System.out.println("Number is positive!!!");
		}else {
			System.out.println("Number is negative!!!");
		}

	}

}
