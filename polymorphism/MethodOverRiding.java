package polymorphism;

public class MethodOverRiding extends MethodOverLoading {
	
	void add(int a,int b)
	{
		System.out.println("OverRiding Addition :"+(a+b));
	}
	

	public static void main(String[] args)
	{
		MethodOverRiding or=new MethodOverRiding();
		or.add(55, 6);
	}

}
