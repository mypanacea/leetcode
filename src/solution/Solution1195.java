package solution;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Solution1195 {
    private int n;

    private int count;

    public Solution1195(int n) {
        this.n = n;
        this.count = n;
    }

    Semaphore fizz = new Semaphore(0);

    Semaphore buzz = new Semaphore(0);

    Semaphore fizzbuzz = new Semaphore(0);

    Semaphore number = new Semaphore(1);

    public void fizz(Runnable printFizz) throws InterruptedException {
        while(count > 0){
            fizz.acquire();
            if(count == 0){
                break;
            }
            count--;
            printFizz.run();
            number.release();
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(count > 0){
            buzz.acquire();
            if(count == 0){
                break;
            }
            count--;
            printBuzz.run();
            number.release();
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(count > 0){
            fizzbuzz.acquire();
            if(count == 0){
                break;
            }
            count--;
            printFizzBuzz.run();
            number.release();
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        while(count != 0){
            number.acquire();
            if((n - count + 1) % 5 == 0 && (n - count + 1) % 3 == 0){
                fizzbuzz.release();
                continue;
            }
            if((n - count + 1) % 3 == 0){
                fizz.release();
                continue;
            }
            if((n - count + 1) % 5 == 0){
                buzz.release();
                continue;
            }
            number.release();
            printNumber.accept(n - count + 1);
            count--;
        }
        fizz.release();
        buzz.release();
        fizzbuzz.release();
    }
}
