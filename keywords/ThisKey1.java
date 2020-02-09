package keywords;

public class ThisKey1 {
	int id;
	String name;
	
	ThisKey1(){
		this(1,"abcd");
		System.out.println("inside default constructor");
		  
	}
	
	
	ThisKey1(int id,String name){
		System.out.println("constructor body id:"+id+"\nName :"+name);
		this.id=id;
		this.name=name;
	}
	
	private void showData()
	{
		getData();
		System.out.println("method body  id:"+id+"\nName :"+name);
		
	}
	private void getData() {
		System.out.println("Inside getData");
	}
	public static void main(String[] args)
	{
		ThisKey1 key=new ThisKey1(1,"abcd");
		key.showData();
	}
}
