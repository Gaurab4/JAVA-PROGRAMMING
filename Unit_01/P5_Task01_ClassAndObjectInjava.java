package Unit_01;

public class P5_Task01_ClassAndObjectInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC2 obj = new ABC2();
		obj.display2();
		
		ABC2.display();

	}

}
class ABC2{
	int a = 10;
	static int b = 10;
	
	static void display()
	{
		int b = 10;
		
		b++;
		
		//System.out.printfln(a);
		System.out.println(a);
	}

}
