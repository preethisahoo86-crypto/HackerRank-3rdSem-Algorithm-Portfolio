import java.util.*;

public class Solution {

    public static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);

        int count = 0;
        int total = 0;

        for (int price : prices) {
            if (total + price <= k) {
                total += price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println(maximumToys(prices, k));

        sc.close();
    }
}