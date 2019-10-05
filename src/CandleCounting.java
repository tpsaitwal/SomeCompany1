import java.io.IOException;
import java.util.Scanner;
public class CandleCounting {

	/*
     * Complete the candlesCounting function below.
     */
    static int candlesCounting(int k, int[][] candles) {
        /*
         * Write your code here.
         */

    	return 3;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] candles = new int[n][2];

        for (int candlesRowItr = 0; candlesRowItr < n; candlesRowItr++) {
            String[] candlesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int candlesColumnItr = 0; candlesColumnItr < 2; candlesColumnItr++) {
                int candlesItem = Integer.parseInt(candlesRowItems[candlesColumnItr]);
                candles[candlesRowItr][candlesColumnItr] = candlesItem;
            }
        }

        int result = candlesCounting(k, candles);

        System.out.println(String.valueOf(result));
        scanner.close();
    }

}
