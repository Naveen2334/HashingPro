package HashingSession2;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

	public static int firstUniqChar(String s) {

		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(hm, 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) > 2) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("ghhhhdgd"));
	}

}
