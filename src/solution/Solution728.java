package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Брут-форс
 * Быстрей чем 75% решений
 */
public class Solution728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> retVal = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (noSkip(i)) {
                retVal.add(i);
            }
        }

        return retVal;
    }

    public static void main(String[] args) {
        for (Integer number : selfDividingNumbers(1, 22)) {
            System.out.println(number);
        }
    }

    private static boolean noSkip(final int i) {
        for (char c : String.valueOf(i).toCharArray()) {
            if (c == '0' || i % (c - '0') != 0) {
                return false;
            }
        }
        return true;
    }
}
