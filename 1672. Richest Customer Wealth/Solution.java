class Solution {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            int sum = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                sum += accounts[customer][bank];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
