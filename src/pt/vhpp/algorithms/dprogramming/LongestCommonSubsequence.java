package pt.vhpp.algorithms.dprogramming;
/**
 * @author Vitor Pereira
 *
 * Longest Common Subsequence
 */
public class LongestCommonSubsequence {
    private String first,second;
    int[][] opt;

    public LongestCommonSubsequence(String first, String second) {
        this.first = first;
        this.second = second;
        calculateLCS();
    }

    /*              LCS FUNCTION DEFINITION:
    *                             _
    *                            |   0                                  if i = 0 or j = 0
    * LCS(Xi,Yj) =              <|  (LCS(Xi-1,Yj-1),xi)                 if Xi = Yj
    *                            |_ max(LCS(Xi,Yj-1),LCS(Xi-1,Yj))      if Xi != Yj
    */
    private void calculateLCS() {
        int M = first.length();
        int N = second.length();

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        opt = new int[M+1][N+1];

        // compute length of LCS and all subproblems via dynamic programming O(MN)
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (first.charAt(i) == second.charAt(j)) {
                    opt[i][j] = opt[i+1][j+1] + 1;
                } else {
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }
    }

    public int getLength() {
        return opt[0][0];
    }

    public String getValue() {
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer(first.length() > second.length() ? first.length() : second.length());
        while (i < first.length() && j < second.length()) {
            if (first.charAt(i) == second.charAt(j)) {
                sb.append(first.charAt(i));
                i++;
                j++;
            } else if (opt[i+1][j] >= opt[i][j+1]) { 
                i++;
            } else {
                j++;
            }
        }
        return sb.toString();
    }
}
