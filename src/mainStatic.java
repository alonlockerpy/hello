
public class mainStatic {

	public static void main(String[] args) 
	{
		HelloWorld t1 = new HelloWorld();
		HelloWorld t2 = new HelloWorld();
		t1.increment();
		t2.increment();
		System.out.println(t2.x);
		System.out.println(t1.y);
	}

}
