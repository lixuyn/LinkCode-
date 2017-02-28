package scu.wsn.lx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumberIII {
	public List<Integer> singleNumberIII(int[] A) {
		// write your code here
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		if (A == null || A.length == 0)
			return list;
		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i]) == null) {
				map.put(A[i], 1);
			} else {
				map.put(A[i], map.get(A[i]) + 1);
			}
		}
		for (Map.Entry<Integer,Integer> en : map.entrySet()) {
			if (en.getValue() == 2) {
				int t = en.getKey();
				list.add(t);
			}
		}
		return list;
	}
}
