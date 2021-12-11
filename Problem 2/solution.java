// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B) {
        int i = 1, j = 0;
        List<Integer> results = new ArrayList<Integer>();

        while (j < B) {
            j = i * (i + 1);

            if (j >= A && j <= B) {
                results.add(j);
            }

            i++;
        }

        return results.size();
    }
}
