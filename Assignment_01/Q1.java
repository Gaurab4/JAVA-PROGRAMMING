package Assignment_01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float avg;
		System.out.println("Enter details of students:-\n");
		System.out.println("For Student 1:");
		Student obj1 = new Student(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextFloat());
		System.out.println("For Student 2:");
		Student obj2 = new Student(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextFloat());
		System.out.println("For Student 3:");
		Student obj3 = new Student(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextFloat());
		System.out.println("For Student 4:");
		Student obj4 = new Student(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextFloat());
		System.out.println("For Student 5:");
		Student obj5 = new Student(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextFloat());
		System.out.println("For Student 6:");
		Student obj6 = new Student(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextFloat());
		sc.close();
		avg = (obj1.per + obj2.per + obj3.per + obj4.per + obj5.per + obj6.per) / 6;
		System.out.println("Average percentage of Students is:" + avg);
	}

}


class Student {
	String name = new String();
	int age;
	char sec;
	float per;

	Student(String a, int b, char c, float d) {
		name = a;
		age = b;
		sec = c;
		per = d;
	}
}