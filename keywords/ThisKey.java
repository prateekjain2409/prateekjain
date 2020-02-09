package keywords;

public class ThisKey {
	int id;
	String name;
	
	private void showData() {
		System.out.println("id:"+id+"\nName :"+name);
	}
	
	ThisKey(int id,String name){
		System.out.println("id:"+id+"\nName :"+name);
		
	}
	public static void main(String[] args)
	{
		ThisKey key=new ThisKey(1,"abcd");
		key.showData();
	}
}
