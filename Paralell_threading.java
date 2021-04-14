import java.util.Scanner;

// thread to print prime numbers
class part1 extends Thread {
	public synchronized void run()
	{
		int i = 0;
		int num = 0;
		String primeNumbers = "";
		int prime_count=0;
		
		for (i = 1; i <= 1000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				
				// condition to check if the number is prime
				if (i % num == 0) {
					
					// increment counter
					counter = counter + 1;
				}
			}
			
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
				prime_count=prime_count+1;
			}
		}
		
		System.out.println("\nPrime numbers from 0 to 1000 : \n"
			+ prime_count);
		
		System.out.println();
	}
}

// thread to print palidrome numbers
class part2 extends Thread {
	public synchronized void run()
	{
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
                if(i%2==0){
                    count=count+1;
                }
		}
		System.out.println("Even numbers from 1 to 1000 : \n"+count);
	}
}
public class Main {
	public static void main(String args[])
	{
		part1 t1 = new part1();
		part2 t2 = new part2();

		Thread m1 = new Thread(t1);
		Thread m3 = new Thread(t2);
		Scanner sc = new Scanner(System.in);

		// start() method starts the execution of thread.
		m1.start();
		m3.start();

		try {

			// join() method waits for the thread to die
			m1.join();
			m3.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
