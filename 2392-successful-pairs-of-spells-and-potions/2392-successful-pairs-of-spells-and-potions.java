import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            long currentSpell = spells[i];

            int low = 0;
            int high = m - 1;
            int firstSuccessfulPotionIndex = m;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long)potions[mid] * currentSpell >= success) {
                    firstSuccessfulPotionIndex = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            res[i] = (m - firstSuccessfulPotionIndex); 
        }

        return res;
    }
}