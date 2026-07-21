package com.Arrays;

import java.util.*;

public class IntersectionOfTwoArrays{
    static void main(String[] args) {
        int[] nums1 = {1, 14, 3, 8, 1,5};
        int[] nums2 = {1, 2, 6, 4, 1,17};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        System.out.println(map.get(3));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums2){
            if(set.contains(i)){
                ans.add(i);
            }
        }
        int[] res = new int[ans.size()];
        int index = 0;
        for(int i : ans){
            res[index++] = i;
        }
        return res;
    }
}
