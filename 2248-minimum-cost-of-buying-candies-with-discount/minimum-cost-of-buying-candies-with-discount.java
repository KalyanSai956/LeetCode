class Solution {
    public int minimumCost(int[] cost) {
        int ans = 0;
        int took = 0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--) {
            if(took == 2) {
                took = 0;
                continue;
            }
            ans += cost[i];
            took++;
        }
        return ans;
    }
}