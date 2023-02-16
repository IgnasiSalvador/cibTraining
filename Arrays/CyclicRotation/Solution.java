class Solution { 
  public int[] solution(int[] A, int K) {
    for(int i=0;1<K; i++) {
        int lastValue = A[A.length-1];
        for(int j=A.length-2; j>=0; j--) {
            A[j+1] = A[j];
        }
        A[0] = lastValue;
    }
    return A;

    }
}
