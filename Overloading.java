
public class Overloading {

	public static void main(String[] args) {
		
		Overloading o1=new Overloading();
		o1.add();
		o1.add(100,200);
		o1.add(40,50.4);
		

	}
	 
	void add()
	{
		int a=10; int b=20;
		int c=a+b;
		System.out.println(c);
	}
	void add(int x,int y)
	{
		
		int c=x+y;
		System.out.println(c);
	}
	void add(int x,double y)
	{
		
		double c=x+y;
		System.out.println(c);
	}

}
