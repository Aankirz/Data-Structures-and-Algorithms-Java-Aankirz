package Assignment;

public class ShortestSubsequence {
//    public int solve(String S,String V){
//        int m = S.length, n = V.length;
//
//        // declaring 2D array of m + 1 rows and
//        // n + 1 columns dynamically
//        int dp[][] = new int[m + 1][n + 1];
//
//        // T string is empty
//        for (int i = 0; i <= m; i++)
//        {
//            dp[i][0] = 1;
//        }
//
//        // S string is empty
//        for (int i = 0; i <= n; i++)
//        {
//            dp[0][i] = 1005;
//        }
//
//        for (int i = 1; i <= m; i++)
//        {
//            for (int j = 1; j <= n; j++)
//            {
//                char ch = S.charAt(i-1);
//                int k;
//                for (k = j - 1; k >= 0; k--)
//                {
//                    if (V.charAt(k) == ch)
//                    {
//                        break;
//                    }
//                }
//
//                // char not present in T
//                if (k == -1)
//                {
//                    dp[i][j] = 1;
//                }
//                else
//                {
//                    dp[i][j] = Math.min(dp[i - 1][j],
//                            dp[i - 1][k] + 1);
//                }
//            }
//        }
//
//        int ans = dp[m][n];
//        if (ans >= 1005)
//        {
//            ans = -1;
//        }
//        return ans;
//    }

    }
