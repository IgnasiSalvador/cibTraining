class Solution {
    public int solution (int x, int y, int D) {
        
        int distance = y-x;
        int jumps = (int)Math.ceil(distance / (double)D);
        return jumps;
    }
}
