package com.sushant.algorithms.hash;

import java.util.HashMap;

/*8
 * @Author Sushant
 */
public class FrequencHashMap {

	 public static void displayFreqOfEachElement(int[] arr) {
	        HashMap<Integer, Integer> freqMap = new HashMap<>();
	        for(int x : arr) {
	            if (!freqMap.containsKey(x)){
	                freqMap.put(x, 1);
	            } else {
	                freqMap.put(x, freqMap.get(x) + 1);
	            }
	        }

	        freqMap.forEach((key, value) -> System.out.println(key +
	                " : " + value));
	    }

	    public static void main(String[] args) {
	        displayFreqOfEachElement(new int[] {4, 1, 3, 4, 5, 8, 3, 4,
	                4, 4, 4, 6, 5});
	    }

}
