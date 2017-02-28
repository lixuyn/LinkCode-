package scu.wsn.lx;

public class LongestPalindromicSubtring {

	public static void main(String[] args) {
		/*
		 * String str ="567765"; int i =0; int j =
		 * str.lastIndexOf(str.charAt(i)); System.out.println(str.charAt(i)+"  "
		 * + str.charAt(j)); while(str.charAt(i) == str.charAt(j)){
		 * System.out.println(str.charAt(i)); i++; j--; }
		 */
		String str="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		String str1="abcda";

		System.out.println(longestPalindrome(str1));
	}

	public static String longestPalindrome(String s) {
		int len = s.length();
		if (len <= 1)
			return s;
		int start = 0, maxLen = 0;
		for (int i = 1; i < len; i++) {
			// 寻找以i-1,i为中点偶数长度的回文
			int low = i - 1, high = i;
			while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
			}
			if (high - low - 1 > maxLen) {
				maxLen = high - low - 1;
				start = low + 1;
			}

			// 寻找以i为中心的奇数长度的回文
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
			}
			if (high - low - 1 > maxLen) {
				maxLen = high - low - 1;
				start = low + 1;
			}
		}
		System.out.println(start+"   "+ maxLen);
		if(maxLen == 1) return s.substring(0,1);
		return s.substring(start,start+ maxLen);
	}

}
