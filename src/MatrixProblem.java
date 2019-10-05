import java.util.ArrayList;
import java.util.Scanner;

public class MatrixProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int N = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Pairs " + N +" times");
		ArrayList<String> pairs = new ArrayList<>();
		for(int i=0; i< N ; i++) {
			pairs.add(sc.nextLine());
		}
		System.out.println(pairs);
		sc.close();
		int maxRowNum = 0;
		int maxColumnNum = 0;
		for(String pair: pairs) {
			String [] pairArr = pair.split(" ");
			if(maxRowNum < Integer.parseInt(pairArr[0]))
				maxRowNum = Integer.parseInt(pairArr[0]);

			if(maxColumnNum < Integer.parseInt(pairArr[1]))
				maxColumnNum = Integer.parseInt(pairArr[1]);		

		}

		int minRowNum =maxRowNum;
		int minColumnNum = maxColumnNum;
		for(String pair: pairs) {
			String [] pairArr = pair.split(" ");
			if(minRowNum > Integer.parseInt(pairArr[0])) 
				minRowNum = Integer.parseInt(pairArr[0]);
		
			if(minColumnNum > Integer.parseInt(pairArr[1])) 
				minColumnNum = Integer.parseInt(pairArr[1]);
		}
		int [][] matrix = new int [maxRowNum][maxColumnNum];
		for(String pair: pairs) {
			String [] pairArr = pair.split("\\s+");
			int innerRowNum = Integer.parseInt(pairArr[0]);
			int innerColumnNum = Integer.parseInt(pairArr[1]);
			for(int i=0; i<innerRowNum; i++) {
				for(int j=0; j<innerColumnNum; j++) {
					matrix[i][j]++;
				}
			}
		}

		for(int i=0; i<maxRowNum; i++) {
			for(int j=0; j<maxColumnNum; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		if(minRowNum * minColumnNum == 0){
			System.out.println("Answer should be " + 1);	
		} else {
			System.out.println("Answer should be " + minRowNum * minColumnNum);	
		}
		

	}

}
