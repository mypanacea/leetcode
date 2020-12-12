package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class Solution1356 {

	public static int[] sortByBits(int[] arr) {
		Arrays.sort(arr);
		HeapInteger[] temp = new HeapInteger[14];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = new HeapInteger();
		}
		for (int i = 0; i < arr.length; i++) {
			temp[Integer.bitCount(arr[i])] = temp[Integer.bitCount(arr[i])].add(arr[i]);
		}
		return Stream.of(temp)
				.flatMap(heapInteger -> heapInteger.get().stream())
				.mapToInt(Integer::intValue)
				.toArray();
	}

	public static void main(String[] args) {
		Map map = new ConcurrentHashMap();
		System.out.println(sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
	}

	private static class HeapInteger {

		private final List<Integer> list = new ArrayList<>();

		public HeapInteger add(int i) {
			list.add(i);
			return this;
		}

		public List<Integer> get() {
			return list;
		}
	}
}
