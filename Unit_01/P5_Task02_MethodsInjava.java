package Unit_01;

public class P5_Task02_MethodsInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ABC3 obj = new ABC3();
		
		ABC3.display();
		System.out.println(ABC3.a);

	}

}

class ABC3{
	static int a = 10;
	
	static void display() {
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
	}
	int display2()
	{
		System.out.println(a);
		
		return a;
		
	}

}
