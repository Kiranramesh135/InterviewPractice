package com.java.interviewpractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCount {

	public static void main(String[] args) {

		String a = "abcdasdwswabqbhfif";
		char[] s = a.toCharArray();
		int size = s.length;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int j = 0; j < size; j++) {

			if (map.containsKey(s[j])) {
				map.put(s[j], map.get(s[j]) + 1);
			}
			else {
				map.put(s[j], 1);
			}
		}

		Set<Character> keys = map.keySet();
		for (char c : keys) {
			if (map.get(c) > 1) {
				System.out.println(c + "--->" + map.get(c));
			}
		}

	}
}
