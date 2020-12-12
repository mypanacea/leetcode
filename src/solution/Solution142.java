package solution;

public class Solution142 {

    public static ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode tor = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tor = tor.next;
            if (hare == tor) {
                tor = head;
                break;
            }
        }
        while (hare != null && hare.next != null) {
            if (hare == tor) {
                return tor;
            }
            hare = hare.next;
            tor = tor.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        detectCycle(node1);
    }

    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
