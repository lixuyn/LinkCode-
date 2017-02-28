package scu.wsn.lx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;


 /**
  [                     [
   [1, 3],                [1, 6],
   [2, 6],      =>        [8, 10],
   [8, 10],               [15, 18]
   [15, 18]             ]
  ]
	 
	  * [[2,3],[4,5],[6,7],[8,9],[1,10]]
	  * 
	  */
public class MergeInterval {
	public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0) return null;
        List<Interval> list = new ArrayList<>();
        Collections.sort(intervals,new Compre());
        list.add(intervals.get(0));     
        if(intervals.size() == 1){        	
        	 return list;
         }
        Interval temp= list.get(0);; 
        for(int j=1;j<intervals.size();j++){        	
        	if(intervals.get(j).start> temp.end){
        		list.add(intervals.get(j));
        	}else{
        		temp.start = intervals.get(j).start<temp.start?intervals.get(j).start:temp.start;
        		temp.end = intervals.get(j).end>temp.end?intervals.get(j).end:temp.end;
        	}
        }
        return list;
    }
	
	class Compre implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Interval i1 = (Interval)o1;
			Interval i2 = (Interval)o2;
			return i1.start-i2.start;
		}
	}
	@Test
	public void Test(){
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(2,3));
		intervals.add(new Interval(4,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(8,9));
		intervals.add(new Interval(1,10));
		merge(intervals);
	}
}
