package leetcode;

import java.util.Arrays;

public class P0881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int left = 0;
        int right = people.length - 1;
        while(left <= right){
            if( (people[left] + people[right]) <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}
