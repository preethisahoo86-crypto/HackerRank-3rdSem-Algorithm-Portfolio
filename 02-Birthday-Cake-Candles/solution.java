import java.util.*;

public class solution {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = candles.get(0);
        int count = 0;

        for (int height : candles) {
            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }

        System.out.println(birthdayCakeCandles(candles));

        sc.close();
    }
}