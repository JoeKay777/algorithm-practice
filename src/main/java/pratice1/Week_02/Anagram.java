package pratice1.Week_02;

import java.util.HashMap;
import java.util.Map;
/**
 * 242. 有效的字母异位词
 * @author Joe
 *
 */
public class Anagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) return false;
		Map<Character, Integer> charMap = new HashMap<>(s.length());
		for (char c : s.toCharArray()) {
			Integer count = charMap.getOrDefault(c, 0);
			charMap.put(c, ++count);
		}
		for (char c : t.toCharArray()) {
			Integer count = charMap.getOrDefault(c, 0);
			if (--count < 0) {
				return false;
			}
			charMap.put(c, count);
		}
		return true;
	}
}
