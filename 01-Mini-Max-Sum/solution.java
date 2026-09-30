import java.util.*;

public class solution {

    public static void miniMaxSum(List<Integer> arr) {

        long totalSum = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for (int num : arr) {
            totalSum += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minimumSum = totalSum - max;
        long maximumSum = totalSum - min;

        System.out.println(minimumSum + " " + maximumSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        miniMaxSum(arr);

        sc.close();
    }
}