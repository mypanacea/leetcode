package solution;

import java.util.concurrent.CountDownLatch;

public class Solution01 {

    static final Object guns = "guns";

    public static void main(String[] args) {
        Player[] p = new Player[4];
        p[0] = new Player("player1");
        p[1] = new Player("player2");
        p[2] = new Player("player3");
        p[3] = new Player("player4");
        p[1].setPriority(3);
        p[2].setPriority(2);
        p[3].setPriority(1);
        p[0].start();
        p[1].start();
        p[2].start();
        p[3].start();
    }

    public static class Player extends Thread {

        public Player(String name) {
            super(name);
        }

        public void run() {
            synchronized (Solution01.guns) {
                System.out.println(getName() + " is using the guns");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(getName() + " does some drugs");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(getName() + " is swimming in money right now");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + " Wasted!");
            }
        }
    }
}
