class Solution {
    int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else if (A[m] == X) {
                l = m; break;
            } else {
                l = m + 1;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}
