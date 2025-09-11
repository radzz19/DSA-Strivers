package SlidingWindow;

public class GrumpyBookStore {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int n = customers.length;
        int baseSatisfied = 0;
        int extraSatisfied = 0;
        int maxExtraSatisfied = 0;
        
        // Base satisfied customers (when grumpy == 0)
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseSatisfied += customers[i];
            }
        }

        // Compute initial window [0, k-1]
        for (int i = 0; i < k; i++) {
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }
        }
        maxExtraSatisfied = extraSatisfied;

        // Slide the window from k to n-1
        for (int i = k; i < n; i++) {
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }
            if (grumpy[i - k] == 1) {
                extraSatisfied -= customers[i - k];
            }
            maxExtraSatisfied = Math.max(maxExtraSatisfied, extraSatisfied);
        }

        // Final result
        return baseSatisfied + maxExtraSatisfied;
    }
}


