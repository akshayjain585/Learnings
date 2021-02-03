package leetCode.Easy;

/*
 * Ref : https://leetcode.com/problems/nim-game/submissions/
 * Input: 4
 * Output: false 
 * Explanation: If there are 4 stones in the heap, then you will never win the game;
             No matter 1, 2, or 3 stones you remove, the last stone will always be 
             removed by your friend.
 */

public class NimGame {
	
	public static boolean nimGame(int n) {
		if(n%4 != 0){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		System.out.println(nimGame(n));

	}

}
