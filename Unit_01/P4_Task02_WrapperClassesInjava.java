package Unit_01;

public class P4_Task02_WrapperClassesInjava {

	public static void main(String[] args) {
		//converting int into Integer 
		int a = 20 ;
		
		String s = "" + a + "";
		
		Integer i = Integer.valueOf(a);
		Integer j = a;
		
		System.out.println(a+" "+ i + " "+j);
		System.out.println(i.toString());
		//a.toString() can not be done due to a is int not object
		
		//Autoboxing:Converting primitive int objects
		
		
		byte b=10;
		Byte byteobj= b;
		
		System.out.println(byteobj);
		
		//Unboxing:Converting Objects to Primitives
		byte bytevalue=byteobj;
		
		System.out.println(bytevalue);
		

}
}
