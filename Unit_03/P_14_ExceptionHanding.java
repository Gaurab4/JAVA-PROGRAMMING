package Unit_03;

public class P_14_ExceptionHanding {
		public void  main(String[] args) {
			
			exception obj = new exception(); // creating an object
			// obj.BasicException(); // calling methods with the help of object
			obj.HandleException();
			// obj.MultipleCatch();
			// obj.inputMismatch();
			// obj.StackOverFlow(5);
			// obj.OutofBound();
			// obj.nullpoitnerexception();
			// try {
			// obj.useofthrow();
			// } catch (Exception e) {
			// System.out.println("Exception "+ e.getMessage());
			// }
			// try {
			// obj.UseThrows_Finally();
			// } catch (Exception e) {
			// System.out.println("Exception Handled\n"+ e.getMessage());
			//
			// }
			// finally // code inside finally block will execute no matter what... so
			// remember to put only important code in here that you want
			// // to run before the program breaks !!
			// {
			// System.out.println("This is inside finally block..Here, Put only important
			// code");
			// }

			// obj.manualException();

		}

	}

	class exception // Exception handling
	{
		void BasicException() {
			int a = 5, b = 0;
			int c = a / b;
			System.out.println("exception: " + c);
		}

		void HandleException() {
			try {
				int a = 5, b = 0;
				int c = a / b;

				System.out.println("Inside try block" + c);
			} catch (ArithmeticException e) {
				System.out.println("Exception handled !");
			}

			System.out.println("Outside try and catch block");
		}

		void MultipleCatch() {

			try {
				int a = 5, b = 0;
				int c = a / b;

				System.out.println("Inside try block" + c);
			} catch (ArithmeticException e) {
				System.out.println("Exception encountered and handled by sub class of Exception !");
			} catch (Exception e) {
				System.out.println("Exception handled by Super exception class!");
			}

			System.out.println("Outside try and catch block");
		}

		void inputMismatch() {
			try {
				int i = 0;
				Scanner sc = new Scanner(System.in);
				i = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Input Mismatch Exception handled !");
			}

			System.out.println("Outside the try and catch block");

		}

		void StackOverFlow(int i) {
			try {
				while (i > 0) {
					StackOverFlow(++i);
				}
			} catch (Exception e) {
				System.out.println("Exception Handled !");
			}
			System.out.println("Outside the try and catch block");
		}

		void OutofBound() {
			try {
				int a[] = { 1, 2, 3 };
				System.out.println(a[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Out of Bound Exception handled !");
			}
			System.out.println("Outside try and catch block");
		}

		void nullpoitnerexception() {

			try {
				String s = null;

				int len = s.length();
				System.out.println("lenght is " + len);

			} catch (Exception e) {
				System.out.println("Exception handled " + e.getMessage());
			}
			System.out.println("Outside try-catch");

		}

		void useofthrow() {
			int age = 6;
			try {
				if (age == 6) {
					throw new Exception("Exception is thrown");
				} else {
					System.out.println("Age is " + age);
				}
			} catch (Exception e) {
				System.out.println("Exception handled " + e.getMessage());
			}

		}

		void UseThrows_Finally() throws Exception {
			String a;
			Scanner s = new Scanner(System.in);
			a = s.next();
			if (a.length() > 6) {
				throw new Exception("String length reached its max !");
			} else {
				System.out.println("No Exception was generated ");
			}

		}

		void checkedAndUncheckedException() {
			int x = 0;
			int y = 10;
			int z = y / x;

			System.out.println(z);
			try {
				useofthrow();
			} catch (Exception e) {
				System.out.println("checked and unchecked exception!!");

			}

		}

		void manualException() {
			Scanner s = new Scanner(System.in);

			int l, b;
			l = s.nextInt();
			b = s.nextInt();

			try {
				if (l <= 0 || b <= 0) {
					throw new Exception("error");
				} else {
					System.out.println("Area of rectangle is " + l * b);
				}

			} catch (Exception e) {
				System.out.println("Exception Handled\n " + e.getMessage());
			}

			finally {
				System.out.println("exiting....");
			}

		}
		
	}