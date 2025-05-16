/*You are given a number ‘N’ and a query ‘Q.’ If ‘Q’ is 1, then you have to return 
the sum of all integers from 1 to ‘N,’ else if ‘Q’ is equal to 2 then 
you have to return the product of all integers from 1 to ‘N.’ 
Since the product can be very large, return it modulo 10 ^ 9 + 7.

For example

Given ‘N’ = 4, ‘Q’ = 1. 
Then the answer is 10 because the sum of all integers between
 1 and 4 are 1, 2, 3, and 4. Hence 1 + 2 + 3 + 4 is equal to 10.

Sample Input 1 :
2
4 1 
4 2
Sample Output 1 :
10
24 
Explanation of the Sample Input 1:
In the first test case, the answer is 10 because all integers between 
1 and 4 are 1, 2, 3, and 4. Hence 1 + 2 + 3 + 4 is equal to 10.

In the second test case, the answer is 25 because all integers between
 1 and 4 are 1, 2, 3, and 4. Hence 1 * 2 * 3 * 4 is equal to 24.
Sample Input 2 :
2
5 1
5 2 
Sample Output 2 :
15
120*\


import java.util.Scanner;

public class Solution {

    static final int MOD = 1000000007;

    public static long sumOrProduct(int n, int q) {
        if (q == 1) {
            // Calculate the sum of integers from 1 to n
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            // Calculate the product of integers from 1 to n (modulo 10^9 + 7)
            long product = 1;
            for (int i = 1; i <= n; i++) {
                product = (product * i) % MOD;
            }
            return product;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Read the number of test cases
        int testcase = s.nextInt();

        // Loop through each test case
        for (int i = 0; i < testcase; i++) {
            int n = s.nextInt();  // Read N
            int q = s.nextInt();  // Read Q (1 for sum, 2 for product)

            // Call the sumOrProduct function and print the result
            long result = sumOrProduct(n, q);
            System.out.println(result);
        }

        s.close();
    }
}
