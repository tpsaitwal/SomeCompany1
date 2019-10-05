import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Result {

	/*
	 * Complete the 'counts' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY teamA
	 *  2. INTEGER_ARRAY teamB
	 */

	public static List<Integer> counts(List<Integer> teamA, List<Integer> teamB) {
		if(teamA == null || teamA.isEmpty()){
			return Collections.emptyList();
		}

		if(teamB == null || teamB.isEmpty()){
			return Collections.emptyList();
		}
		int [] resultArr = new int[teamB.size()];
		int i =0;
		for(Integer scoreB : teamB){
			for(Integer scoreA: teamA){
				if(scoreA.intValue() <= scoreB.intValue()){
					resultArr[i] = resultArr[i] +1;
				}
			}
			i++;
		}
		List<Integer> returnResult = new ArrayList<>();
		for(int res : resultArr){
			returnResult.add(res);
		}
		return returnResult;
	}

}

public class FootBall {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH.yxy"));

		int teamACount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> teamA = new ArrayList<>();

		for (int i = 0; i < teamACount; i++) {
			int teamAItem = Integer.parseInt(bufferedReader.readLine().trim());
			teamA.add(teamAItem);
		}

		int teamBCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> teamB = new ArrayList<>();

		for (int i = 0; i < teamBCount; i++) {
			int teamBItem = Integer.parseInt(bufferedReader.readLine().trim());
			teamB.add(teamBItem);
		}

		List<Integer> result = Result.counts(teamA, teamB);

		for (int i = 0; i < result.size(); i++) {
			// bufferedWriter.write(String.valueOf(result.get(i)));
			System.out.println(String.valueOf(result.get(i)));
			if (i != result.size() - 1) {
				// bufferedWriter.write("\n");
				System.out.println();
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
