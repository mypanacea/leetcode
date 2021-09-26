package solution;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class LockExample {

	private static final Logger logger = Logger.getLogger("LockExample");

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {

			BigDecimal threadNumber = new BigDecimal(i);

			Runnable r = () -> {
				logger.info("thread execution started.");
				try {
					Thread.sleep(1000 * 30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				logger.info("thread execution ended.");
			};
			new Thread(r, "thread-nb-" + threadNumber).start();
		}
	}
}