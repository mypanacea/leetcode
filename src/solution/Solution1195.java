package solution;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Solution1195 {

	private int n;

	Semaphore fizz = new Semaphore(0);

	Semaphore buzz = new Semaphore(0);

	Semaphore fizzbuzz = new Semaphore(0);

	Semaphore number = new Semaphore(1);

	private int count;

	public Solution1195(int n) {
		this.n = n;
		this.count = 1;
	}

	public void fizz(Runnable printFizz) throws InterruptedException {
		while (count <= n) {
			if (count % 3 == 0 && count % 5 != 0) {
				fizz.acquire();
				printFizz.run();
				count++;
				releaseSemaphore(count);
			}
		}
	}

	public void buzz(Runnable printBuzz) throws InterruptedException {
		while (count <= n) {
			if (count % 5 == 0 && count % 3 != 0) {
				buzz.acquire();
				printBuzz.run();
				count++;
				releaseSemaphore(count);
			}
		}
	}

	public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
		while (count <= n) {
			if (count % 15 == 0) {
				fizzbuzz.acquire();
				printFizzBuzz.run();
				count++;
				releaseSemaphore(count);
			}
		}
	}

	public void number(IntConsumer printNumber) throws InterruptedException {
		while (count <= n) {
			if (count % 5 != 0 && count % 3 != 0) {
				number.acquire();
				printNumber.accept(count);
				count++;
				releaseSemaphore(count);
			}
		}
	}

	private void releaseSemaphore(final int i) {
		if (i % 15 == 0) {
			fizzbuzz.release();
			return;
		}
		if (i % 3 == 0) {
			fizz.release();
			return;
		}
		if (i % 5 == 0) {
			buzz.release();
			return;
		}
		number.release();
	}
}
