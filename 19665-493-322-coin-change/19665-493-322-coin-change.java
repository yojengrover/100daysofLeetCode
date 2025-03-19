class Solution {
    public int coinChange(int[] coins, int t) {

        int[] dp = new int[t +1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        Arrays.sort(coins);
       // System.out.println("target = "+ t + " dp ="+ dp[t-1]);
        dp[0] = 0;
        for(int i = 1; i<dp.length; i++){
            for(int coin: coins){
                if(i<coin) break;
                if(dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }

            }
        }
     
        
        return dp[t] == Integer.MAX_VALUE ? -1 : dp[t];
        
    }
}