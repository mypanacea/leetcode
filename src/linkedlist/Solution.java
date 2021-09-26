package linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public ListNode removeZeroSumSublists(ListNode head) {
		ListNode iter = head;
		ListNode iter2 = head;
		List<Integer> temp = new ArrayList<>();
		while (iter != null) {
			if (iter.val < 0) {
				temp.add(iter.val);
			}
			iter = iter.next;
		}
		ListNode res = null;
		while (iter2 != null) {
			if (iter2.val > 0) {
				if (temp.contains(Math.negateExact(iter2.val))) {
					ListNode arg = deleteVal(head, iter2.val);
					res = deleteVal(arg, Math.negateExact(iter2.val));
					temp.remove(Integer.valueOf(Math.negateExact(iter2.val)));
				}
			}
			iter2 = iter2.next;
		}
		return res;
	}

	public void deleteAtIndex(ListNode source, int index) {
		ListNode iter = source;
		int position = 0;
		ListNode prev = null;
		if (index == 0) {
			source = source.next;
			return;
		}
		while (iter != null) {
			if (index == position) {
				prev.next = iter.next;
				break;
			}
			prev = iter;
			iter = iter.next;
			position++;
		}
	}

	public void addAtTail(ListNode source, int val) {
		HashMap<String,String> map=new HashMap<>();
		new ArrayList<>(map.keySet());
		ListNode iter = source;
		while (iter.next != null) {
			iter = iter.next;
		}
		iter.next = new ListNode(val);
	}

	public ListNode reverse(ListNode source) {
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

	public void addAtTail(ListNode source, ListNode accum) {
		ListNode iter = source;
		while (iter.next != null) {
			iter = iter.next;
		}
		iter.next = accum;
	}

	public void subList(ListNode source, int position) {
		int count = 0;
		while (source != null) {
			if (count == position) {
				break;
			}
			count++;
			source = source.next;
		}
	}

	public int get(ListNode source, int index) {
		int position = 0;
		ListNode iter = source;
		while (iter != null) {
			if (position == index) {
				return iter.val;
			}
			position++;
			iter = iter.next;
		}

		return -1;
	}

	public void addAtHead(ListNode source, int val) {
		ListNode accum = new ListNode(val);
		accum.next = source;
		source = accum;
	}

	public void addAtIndex(ListNode source, int index, int val) {
		if (index == 0) {
			source = new ListNode(val);
			return;
		}
		int position = 1;
		ListNode accum = new ListNode(val);
		ListNode iter = source;
		while (iter != null) {
			if (position == index) {
				ListNode temp = iter.next;
				accum.next = temp;
				iter.next = accum;
				break;
			}
			iter = iter.next;
			position++;
		}
	}

	ListNode deleteVal(ListNode source, int val) {
		ListNode iter = source;
		ListNode prev = null;
		while (iter != null) {
			if (iter.val == val) {
				if (prev == null) {
					return source.next;
				}
				prev.next = iter.next;
				return source;
			}
			prev = iter;
			iter = iter.next;
		}
		return source;
	}

	private int size(final ListNode head) {
		ListNode iter = head;
		int size = 0;
		while (iter != null) {
			size++;
			iter = iter.next;
		}

		return size;
	}

	public static class ListNode {

		public int val;

		public ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}
}
