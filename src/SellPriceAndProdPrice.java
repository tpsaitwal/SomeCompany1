import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class Result2 {

	/*
	 * Complete the 'priceCheck' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. STRING_ARRAY products
	 *  2. FLOAT_ARRAY productPrices
	 *  3. STRING_ARRAY productSold
	 *  4. FLOAT_ARRAY soldPrice
	 */

	public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
		if(products == null || products.isEmpty()){
			return 0;
		}
		if(productPrices == null || productPrices.isEmpty()){
			return 0;
		}
		if(products.size() != productPrices.size()){
			return 0;
		}
		if(productSold == null || productSold.isEmpty()){
			return 0;
		}
		if(soldPrice == null || soldPrice.isEmpty()){
			return 0;
		}
		if(productSold.size() != soldPrice.size()){
			return 0;
		}
		int numOfProductSoldWrong = 0;
		for(String soldProd : productSold){
			Float sellPrice = soldPrice.get(productSold.indexOf(soldProd));
			Float actualPrice = productPrices.get(products.indexOf(soldProd));
			System.out.println("Sellprice "+ sellPrice);
			System.out.println("actualPrice "+ actualPrice);
			if(Float.compare(sellPrice, actualPrice) != 0){
				numOfProductSoldWrong++;
			}
		}
		return numOfProductSoldWrong;
	}

}

public class SellPriceAndProdPrice {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int productsCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> products = new ArrayList<>();

		for (int i = 0; i < productsCount; i++) {
			String productsItem = bufferedReader.readLine();
			products.add(productsItem);
		}

		int productPricesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Float> productPrices = new ArrayList<>();

		for (int i = 0; i < productPricesCount; i++) {
			float productPricesItem = Float.parseFloat(bufferedReader.readLine().trim());
			productPrices.add(productPricesItem);
		}

		int productSoldCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> productSold = new ArrayList<>();

		for (int i = 0; i < productSoldCount; i++) {
			String productSoldItem = bufferedReader.readLine();
			productSold.add(productSoldItem);
		}

		int soldPriceCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Float> soldPrice = new ArrayList<>();

		for (int i = 0; i < soldPriceCount; i++) {
			float soldPriceItem = Float.parseFloat(bufferedReader.readLine().trim());
			soldPrice.add(soldPriceItem);
		}

		int result1 = Result2.priceCheck(products, productPrices, productSold, soldPrice);

		bufferedWriter.write(String.valueOf(result1));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
