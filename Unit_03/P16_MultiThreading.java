package Unit_03;

import java.util.Scanner;

/* 
 * Pre-requisites of MultiThreading:
 *
 * Multiprocessing(one by on say to process over every process.....program in running state)
 * - sequential (one by one....only when one process is done then 2nd is processed)
 * - parallel(side by side...one CPU for each process....more the core more the processing unit)
 *  - concurrent(best solution...context switch..if a process is taking time then we leave it and proceed to next)...Sequence+random...[OS]
 *  
 *  Multitasking(divide into small task)
 *  - sequential(if the task is bounded and following the sequence)..context switch is not possible
 *  - parallel(not possible)
 *  - concurrent[User+JVM]...not implemented directly..
 *  Individual tasks are written in individual threads which is known as multi-threading.
 *  Parallel processing is best but it's expensive...Sequential is worst...Concurrent is close to parallel
 *  JVM will do the context switch and decide whether code will execute or not 
 *  Program counter holds the address of next instruction
 *  CPU is the center of processing unit
 *  Each processing unit has their program counter
 *  OS is kind of a manager and CPU is kind of a labor
 *  Process initiation-> User(workload is assigned by the user)
 *  Workload is managed by OS
 *  If user is not giving input then CPU will unnecessary wait....3 millisecond is burst time
 *  Context switch is possible in threads by JVM 
 *  Role of user-> Create thread, start thread
 *  main thread will invoke the other threads
 */
public class P16_MultiThreading {

	public static void main(String[] args) {
		// ABCDEF obj2 = new ABCDEF();
		// C1 obj = new C1();
		// C2 obj1 = new C2();
		// obj.show1();
		// obj1.show2();
		// System.out.println(Thread.currentThread().getName());

		Thread t1 = new Thread(new T1(), "T1");
		Thread t2 = new Thread(new T2(), "T2");
		Thread t3 = new Thread(new T3(), "T3");

		t1.start();
		t2.start();
		t3.start();

		// obj.threadConcept();
		// obj.threadSynchronization();
		// obj.interThreadCommunication();
		// obj.ProducerConsumerProblems();
		// obj.Wait_And_Notify();

	}
}

class C1 {
	void show1() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
	}
}

class C2 {
	void show2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "- Hey_2!");

		}
	}
}

class T1 extends Thread {
	@Override
	public void run() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
	}

}

class T2 implements Runnable {
	@Override

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "- Hey_2!");

		}
	}
}

class T3 implements Runnable {
	@Override

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "- Hey_3!");
			// System.out.println(Thread.currentThread().getName());
			// this will give the name of the thread
		}
	}
}

class ABCDEF {
	void threadConcept() {

	}

	void threadSynchronization() {

	}

	void interThreadCommunication() {

	}

	void ProducerConsumerProblems() {

	}

	void Wait_And_Notify() {

	}
}