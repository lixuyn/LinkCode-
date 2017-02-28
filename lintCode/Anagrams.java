package scu.wsn.lx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class Anagrams {

	/**
	 * @param strs:
	 *            A list of strings
	 * @return: A list of strings
	 */
	public List<String> anagrams(String[] strs) {
		if (strs == null)
			return null;
		long res = 0;
		Map<Long, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			res = 0;
			if (strs[i] != null && !strs[i].equals(""))
			res = stringToAscii(strs[i]);
			if (map.get(res) != null)
				map.get(res).add(strs[i]);
			else {
				List<String> list = new ArrayList<>();
				list.add(strs[i]);
				map.put(res, list);
			}
		}
		ArrayList<String> list = new ArrayList<>();
		for (Map.Entry<Long, List<String>> entry : map.entrySet()) {
			if (entry.getValue().size() > 1) {
				ArrayList<String> temp = (ArrayList<String>) entry.getValue();
				list.addAll(temp);
			}

		}
		return list;
	}
	private long stringToAscii(String target){
        long asciiSum = 0;
        int length = target.length();
        for(int i = 0;i<target.length();i++){
            asciiSum += Math.pow(target.charAt(i) - 'a' + 1,7);    
        }
        if(length == 0)
            return 0;
        return (long) (asciiSum*asciiSum/length);
    }

	@Test
	public void test() {
		String strs[] = { "ray", "cod", "abe", "ned", "arc", "jar", "owl", "pop", "paw", "sky", "yup", "fed", "jul",
				"woo", "ado", "why", "ben", "mys", "den", "dem", "fat", "you", "eon", "sui", "oct", "asp", "ago", "lea",
				"sow", "hus", "fee", "yup", "eve", "red", "flo", "ids", "tic", "pup", "hag", "ito", "zoo" };
		anagrams(strs);
	}

}
