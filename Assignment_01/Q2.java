package Assignment_01;

public class Q2 {

	public static void main(String[] args) {
		
		check o1 = new check();
		check o2 = new check();
		check o3 = new check();
		
		o1.method();
		o2.method();
		o3.method();
		o3.count();

	}

}

class check
{
	static int count = 0;
	
	void method()
	{
		count++;
	}
	void count()
	{
		System.out.println("\n Number of times method is called :"+count);
	}
}