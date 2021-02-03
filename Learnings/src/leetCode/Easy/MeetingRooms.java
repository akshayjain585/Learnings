package leetCode.Easy;

/*
 * https://leetcode.com/problems/meeting-rooms/	: LeetCode premium problem
 * Time : O(nlogn) : Due to sort
 * Space : O(1) : Constant space
 * 
 * Approach : Sort the start time to identify what is the start time of first meeting and then compare the first's meeting end time with next start time and so on.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Interval {
	int start;
	int end;
	
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MeetingRooms {
	
    public static boolean singlePersoncanAttendAllMeetings(int[][] intervals) {
        
        // Passing what we need to sort in comparator generics
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2){
                return i1[0] - i2[0];   // Row of 1st and second Index
            }
        });
        
        // Running the loop from 0th index till second last index -1 as we are doing (i+1) below and each index contains start and end time of meeting.
        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1] > intervals[i+1][0]){  // First's Index column is greater than second Index's row
                return false;
            }
        }
        return true;
    }
    
    // Ref : https://leetcode.com/problems/meeting-rooms-ii/submissions/
    // Time : O(nlogn) : Due to sort
    // Space : O(n) as we created arrays which takes O(n)
    public static int minMeetingRoomsRequired(int[][] intervals) {
        
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        // Have to sort both the list though the start and endTime is messed up now but we will be checking on the basis of if startTime < endTime that means meeting going on else meeting ended when startTime > endTime
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int minRoomsRequired = 0, endsItr = 0;
        for (int i = 0; i < starts.length; i++) {
            if (starts[i] < ends[endsItr]) {
            	minRoomsRequired++;
            } else {
                endsItr++;
            }
        }
        return minRoomsRequired;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Interval[] interval = new Interval[3];
//		
//		interval[0] = new Interval(0,30);
//		interval[1] = new Interval(5,10);
//		interval[2] = new Interval(15,20);
//		
//		for(Interval key : interval) {
//			System.out.println(key.start+" , "+key.end);
//		}
		
		int[][] interval = new int[3][3];
		interval[0][0] = 0;
		interval[0][1] = 30;
		
		interval[1][0] = 5;
		interval[1][1] = 10;
		
		interval[2][0] = 15;
		interval[2][1] = 20;
		
		// Output is false as 30 which is end time of first meeting is greater than start time of second meeting which is 5, so a person can't attend all the meetings.
		System.out.println("Single person can attend all meetings => "+singlePersoncanAttendAllMeetings(interval));


		System.out.println("Minimum meeting room required for all the meetings => "+minMeetingRoomsRequired(interval));
		
	}

}
