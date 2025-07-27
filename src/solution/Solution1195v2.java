package solution;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class Solution1195v2 {

	private final int n;

	private int count = 1;

	public Solution1195v2(int n) {
		this.n = n;
	}

	// printFizz.run() outputs "fizz".
	public void fizz(Runnable printFizz) throws InterruptedException {
		checkAndPrint(printFizz, x -> x % 3 == 0 && x % 5 != 0);
	}

	// printBuzz.run() outputs "buzz".
	public void buzz(Runnable printBuzz) throws InterruptedException {
		checkAndPrint(printBuzz, x -> x % 5 == 0 && x % 3 != 0);
	}

	// printFizzBuzz.run() outputs "fizzbuzz".
	public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
		checkAndPrint(printFizzBuzz, x -> x % 15 == 0);
	}

	// printNumber.accept(x) outputs "x", where x is an integer.
	public void number(IntConsumer printNumber) throws InterruptedException {
		checkAndPrint(() -> printNumber.accept(count), x -> x % 3 != 0 && x % 5 != 0);
	}

	private synchronized void checkAndPrint(final Runnable runnable, final IntPredicate predicate) throws InterruptedException {
		while (count <= n) {
			if (predicate.test(count)) {
				runnable.run();
				count++;
				notifyAll();
			} else {
				wait();
			}
		}
	}
}
