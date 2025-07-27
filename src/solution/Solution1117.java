package solution;

import java.util.concurrent.Semaphore;

public class Solution1117 {

	private final Semaphore oxygen = new Semaphore(0);

	private final Semaphore hydrogen = new Semaphore(2);

	public Solution1117() {

	}

	public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		hydrogen.acquire();
		releaseHydrogen.run();
		if (hydrogen.availablePermits() == 0){
			oxygen.release();
		}
	}

	public void oxygen(Runnable releaseOxygen) throws InterruptedException {
		oxygen.acquire();
		releaseOxygen.run();
		hydrogen.release(2);
	}
}
