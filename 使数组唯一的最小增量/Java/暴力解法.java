class Solution {
    public int minIncrementForUnique(int[] A) {
        if (null == A) {
            return 0;
        }

        int[] helpA = new int[80001];
        for (int a : A) {
            helpA[a] += 1;
        }

        int move = 0;
        for (int i = 0; i < 80001; i++) {
            if (helpA[i] > 1) {
                for (int j = 1; j < helpA[i]; j++) {
                    move += j;
                    helpA[i + j] += 1;
                }
            }
        }

        return move;
    }
}