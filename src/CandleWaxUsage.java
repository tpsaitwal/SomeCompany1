import java.io.IOException;
import java.util.Scanner;

public class CandleWaxUsage {


	/*
	 * Complete the function below.
	 */

	static int getTotalCandlesBurnt(int amount, int costOfCandle, int noOfResidueCandles) {
		int candlePurchased = amount / costOfCandle;

		int newCandleMade = candlePurchased / noOfResidueCandles;
		int residueRemain = candlePurchased % noOfResidueCandles;

		while(residueRemain > 0){
			residueRemain +=  newCandleMade % noOfResidueCandles;

			int residueCandle = residueRemain/noOfResidueCandles;

			newCandleMade += residueCandle;

			residueRemain = residueCandle %noOfResidueCandles;
		}

		return (candlePurchased + newCandleMade);
	}

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i < t; i++){
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int ans = getTotalCandlesBurnt(n,c,m);
			System.out.println(String.valueOf(ans));

		}        
		in.close();
	}
}