import java.util.*;

class Solution {
    public int solution(int N) {
        String intToString = Integer.toString(N, 2);
        boolean started = false;
        int gapCounter = 0;		
        int maxGapCount = 0;

        for(int i=0; i<intToString.length(); i++) {
            String binaryNumber = intToString.substring(i, i+1);
            if(binaryNumber.equals("1")) {
                if(started) {
                    if(gapCounter > maxGapCount) {
                        maxGapCount = gapCounter;
                    }
                }
                gapCounter = 0;
                started = true;
            }
            if(binaryNumber.equals("0")) {
                gapCounter++;
            }
        }	
        return maxGapCount;
    }
}
    
