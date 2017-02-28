package scu.wsn.lx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;


public class Merge {
	/**
	 * @param intervals,
	 *            a collection of intervals
	 * @return: A new sorted interval list.
	 */
	
	public List<Interval> merge(List<Interval> ins) {
		if (ins == null || ins.size() == 0)
			return null;
		Collections.sort(ins, new Comp());
		List<Interval> list = new ArrayList<>();
		list.add(ins.get(0));
		for (int i = 1; i < ins.size(); i++) {
			if (ins.get(i).start > list.get(i - 1).end)
				list.add(ins.get(i));
			else
				list.get(i - 1).end = Math.max(list.get(i - 1).end, ins.get(i).end);
		}
		return list;
	}

	private class Comp implements Comparator {
		public int compare(Object o1, Object o2) {
			Interval i1 = (Interval) o1;
			Interval i2 = (Interval) o2;
			return i1.start - i2.start;
		}
	}
	
	/*[[1,4],[0,2],[3,5]]*/
	@Test
	public void test(){
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1, 4));
		list.add(new Interval(0, 2));
		list.add(new Interval(3, 5));
		merge(list);
	}

}
