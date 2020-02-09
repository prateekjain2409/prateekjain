package polymorphism;

public class MethodOverLoading {

	void add(int a,int b)
	{
		System.out.println("Addition :"+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Addition :"+(a+b+c));
	}
	public static void main(String[] args)
	{
	MethodOverLoading m=new MethodOverLoading();
	m.add(20,32,23);
	}
}
