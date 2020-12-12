package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution118 {

	/**
	 * Треугольники паскаля задача N 118
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		if (numRows == 0) {
			return res;
		}
		res.add(Collections.singletonList(1));
		if (numRows == 1) {
			return res;
		}
		res.add(Arrays.asList(1, 1));
		if (numRows == 2) {
			return res;
		}
		for (int i = 2; i < numRows; i++) {
			List<Integer> temp = new ArrayList<>(i + 1);
			temp.add(1);
			for (int j = 2; j < i + 1; j++) {
				temp.add(res.get(i - 1).get(temp.size()) + res.get(i - 1).get(temp.size() - 1));
			}
			temp.add(1);
			res.add(temp);
		}
		return res;
	}
}
