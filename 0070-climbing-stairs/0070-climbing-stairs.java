class Solution {

    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);     
    }
    public int solve(int n,int[] dp){
        if(n==1|| n==2)
            return n;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
}