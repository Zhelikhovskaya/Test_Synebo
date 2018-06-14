public class Task2 {

    public int solution(int[] T) {

        int winterlength = 1;

        for (int i = 1; i < T.length; i++) {
            if (T[i] <= T[0]) {
                winterlength++;
            } else {
                break;
            }
        }
        return winterlength;

    }
}
