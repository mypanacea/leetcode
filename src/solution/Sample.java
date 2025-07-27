package solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Sample {

    public static void main(String[] args) throws Exception {
        System.out.println("asd".charAt(99999));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1).length();
    }
}







