package pratice1.Week_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.cn/problems/group-anagrams/
 * 49. 字母异位词分组
 * @author Joe
 *
 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> strMap = new HashMap<>();
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sortStr = new String(chars);
			List<String> list = strMap.getOrDefault(sortStr, new ArrayList<>());
			list.add(str);
			strMap.put(sortStr, list);
		}
		return new ArrayList<>(strMap.values());
	}
}
