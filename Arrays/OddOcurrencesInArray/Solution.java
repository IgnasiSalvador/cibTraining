import java.util.ArrayList;
import java.util.List;

class Solution {
     List<Integer> unPairedList = new ArrayList<Integer>();
     
        public int solution(int[] A) { 
            for(int i=0; i<A.length; i++) {
                int arrayPositionValue = A[i];
                if(unPairedList.contains(a)){
                    unPairedList.remove(new Integer(a));
                } else {
                    unPairedList.add(a);
                }
            }
            return unPairedList.get(0);

        }
}
