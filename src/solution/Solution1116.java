package solution;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Solution1116 {

	private final Semaphore zero = new Semaphore(1);

	private final Semaphore even = new Semaphore(0);

	private final Semaphore odd = new Semaphore(0);

	private final int n;

	private volatile int count;

	public Solution1116(int n) {
		this.n = n;
		count = 1;
	}

	// printNumber.accept(x) outputs "x", where x is an integer.
	public void zero(IntConsumer printNumber) throws InterruptedException {
		while (count <= n) {
			zero.acquire();
			if (count <= n) {
				printNumber.accept(0);
			}
			even.release();
			odd.release();
		}
		zero.release();
		even.release();
		odd.release();
	}

	public void even(IntConsumer printNumber) throws InterruptedException {
		while (count <= n) {
			even.acquire();
			if (count % 2 == 0 && count <= n) {
				printNumber.accept(count);
				count++;
				zero.release();
			}
		}
	}

	public void odd(IntConsumer printNumber) throws InterruptedException {
		while (count <= n) {
			odd.acquire();
			if (count % 2 != 0 && count <= n) {
				printNumber.accept(count);
				count++;
				zero.release();
			}
		}
	}
}

