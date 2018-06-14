public class Solution {
    public int solution(int A, int B) {
        int r = 0;
        for (int i = 0; i < (int) Math.sqrt(B) + 1; i++) {
            if ((i*i) >=A && i*i <=B) {
                r++;
            }
        }
        return r;
    }
}
