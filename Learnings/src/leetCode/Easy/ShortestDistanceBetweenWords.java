package leetCode.Easy;

/*
 * https://leetcode.com/problems/shortest-word-distance/submissions/
 * 
 * Time : O(n)
 * Space : O(1)
 */

public class ShortestDistanceBetweenWords {

    public static int shortestDistance(String[] words, String word1, String word2) {
        if (words == null || words.length < 2) {
            return Integer.MAX_VALUE;
        }
    	int word1Index = -1;
    	int word2Index = -1;
        int aD = words.length-1;	// As that could be the farthest distance kept as placeholder for comparison.
        for(int i=0; i<words.length; i++){
            if(words[i].equalsIgnoreCase(word1)){
                word1Index = i;
            }else if(words[i].equalsIgnoreCase(word2)){
                word2Index = i;
            }
            
            if(word1Index != -1 && word2Index != -1){
                aD = Math.min(aD, Math.abs(word1Index - word2Index));
            }
        }
        
        return aD;  
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"a","a","b","b"};
		String word1 = "a";
		String word2 = "b";
		
		System.out.println(shortestDistance(input,word1,word2));
	}

}
