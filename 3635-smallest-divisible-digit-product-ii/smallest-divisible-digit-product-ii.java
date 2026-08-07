import java.util.*;

class Solution {

    private static final int[][] FACTOR_COUNTS = {
        {0, 0, 0, 0}, // 0
        {0, 0, 0, 0}, // 1
        {1, 0, 0, 0}, // 2 -> 2^1
        {0, 1, 0, 0}, // 3 -> 3^1
        {2, 0, 0, 0}, // 4 -> 2^2
        {0, 0, 1, 0}, // 5 -> 5^1
        {1, 1, 0, 0}, // 6 -> 2^1 * 3^1
        {0, 0, 0, 1}, // 7 -> 7^1
        {3, 0, 0, 0}, // 8 -> 2^3
        {0, 2, 0, 0}  // 9 -> 3^2
    };

    public String smallestNumber(String num, long t) {
        int[] targetPrimes = new int[4]; // [count(2), count(3), count(5), count(7)]
        int[] primes = {2, 3, 5, 7};
        
        // Step 1: Prime factorize t
        for (int pIdx = 0; pIdx < 4; pIdx++) {
            int p = primes[pIdx];
            while (t % p == 0) {
                targetPrimes[pIdx]++;
                t /= p;
            }
        }
        
        // If t has prime factors greater than 7, it's impossible
        if (t > 1) {
            return "-1";
        }

        int n = num.length();
        int firstZero = num.indexOf('0');
        if (firstZero == -1) {
            firstZero = n;
        }

        // Calculate factors provided by the full prefix of num
        int[] prefixFactors = new int[4];
        for (int i = 0; i < firstZero; i++) {
            int d = num.charAt(i) - '0';
            for (int k = 0; k < 4; k++) {
                prefixFactors[k] += FACTOR_COUNTS[d][k];
            }
        }

        // Check if original string is valid and zero-free
        if (firstZero == n && satisfies(prefixFactors, targetPrimes)) {
            return num;
        }

        // Backtrack from right to left
        for (int i = n - 1; i >= 0; i--) {
            int d = num.charAt(i) - '0';
            
            if (i < firstZero) {
                for (int k = 0; k < 4; k++) {
                    prefixFactors[k] -= FACTOR_COUNTS[d][k];
                }
            } else if (i > firstZero) {
                continue;
            }

            int spaceAfter = n - 1 - i;
            int startDigit = (i < firstZero) ? d + 1 : 1;

            for (int nextDigit = startDigit; nextDigit <= 9; nextDigit++) {
                int[] remainingNeeded = new int[4];
                for (int k = 0; k < 4; k++) {
                    int provided = prefixFactors[k] + FACTOR_COUNTS[nextDigit][k];
                    remainingNeeded[k] = Math.max(0, targetPrimes[k] - provided);
                }

                int[] minDigits = greedyCombinePrimes(remainingNeeded);
                int minLen = totalDigits(minDigits);

                if (minLen <= spaceAfter) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(num, 0, i);
                    sb.append(nextDigit);
                    
                    int onesToFill = spaceAfter - minLen;
                    sb.append("1".repeat(onesToFill));
                    
                    for (int digit = 2; digit <= 9; digit++) {
                        sb.append(String.valueOf(digit).repeat(minDigits[digit]));
                    }
                    return sb.toString();
                }
            }
        }

        // Step 3: Expand string length if necessary
        int[] minDigits = greedyCombinePrimes(targetPrimes);
        int minLen = totalDigits(minDigits);
        
        // FIX: Minimum required length must be max of (n + 1) and minLen
        int totalLen = Math.max(n + 1, minLen);
        int onesToFill = totalLen - minLen;

        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(onesToFill));
        for (int digit = 2; digit <= 9; digit++) {
            sb.append(String.valueOf(digit).repeat(minDigits[digit]));
        }
        return sb.toString();
    }

    private boolean satisfies(int[] provided, int[] required) {
        for (int i = 0; i < 4; i++) {
            if (provided[i] < required[i]) return false;
        }
        return true;
    }

    private int[] greedyCombinePrimes(int[] req) {
        int c2 = req[0], c3 = req[1], c5 = req[2], c7 = req[3];

        int c9 = c3 / 2;
        c3 %= 2;

        int c8 = c2 / 3;
        c2 %= 3;

        int c4 = c2 / 2;
        c2 %= 2;

        int c6 = 0;
        if (c2 == 1 && c3 == 1) {
            c2 = 0;
            c3 = 0;
            c6 = 1;
        } else if (c3 == 1 && c4 > 0) {
            c3 = 0;
            c4--;
            c2 = 1;
            c6 = 1;
        }

        int[] digitCounts = new int[10];
        digitCounts[2] = c2;
        digitCounts[3] = c3;
        digitCounts[4] = c4;
        digitCounts[5] = c5;
        digitCounts[6] = c6;
        digitCounts[7] = c7;
        digitCounts[8] = c8;
        digitCounts[9] = c9;

        return digitCounts;
    }

    private int totalDigits(int[] digitCounts) {
        int sum = 0;
        for (int count : digitCounts) {
            sum += count;
        }
        return sum;
    }
}