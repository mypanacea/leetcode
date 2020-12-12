package solution;

public class Solution445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one = reverse(l1);
        ListNode two = reverse(l2);
        int accum = 0;
        ListNode retVal = null;
        while (one != null || two != null) {
            int a = (one == null) ? 0 : one.val;
            int b = (two == null) ? 0 : two.val;
            ListNode temp = new ListNode((a + b + accum) % 10);
            accum = (a + b + accum) / 10;
            temp.next = retVal;
            retVal = temp;
            if(one != null){
                one = one.next;
            }
            if (two != null){
                two = two.next;
            }
        }
        if(accum > 0){
            ListNode temp = new ListNode(1);
            temp.next = retVal;
            retVal = temp;
        }

        return retVal;
    }

    private static ListNode reverse(ListNode source) {
        ListNode iter = source;
        ListNode temp = null;
        while (iter != null) {
            ListNode var = new ListNode(iter.val);
            var.next = temp;
            temp = var;
            iter = iter.next;
        }

        return temp;
    }

    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);


        ListNode node11 = new ListNode(9);
        ListNode node21 = new ListNode(9);
        node11.next = node21;
        addTwoNumbers(node1, node11);
    }
}
