/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.sum;

/**
 * The Sum of numbers from 1 to n
 *
 * @author Ivan
 */
public class Sum {

    /**
     * Sums numbers from 1 to n
     *
     * @param n The value
     * @return The sum
     */
    public static int sum(int n) {
        int iSum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                iSum += i;
            }
        } else if (n == 0) {
            iSum = 1;
        } else if (n <= -2) {
            for (int i = -2; i >= n; i--) {
                iSum += i;
            }
        }
        return iSum;
    }
}
