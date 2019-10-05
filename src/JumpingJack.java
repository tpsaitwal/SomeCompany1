
import java.util.*;
public class JumpingJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N"); 
		int N = sc.nextInt();
		System.out.println("Enter broken step K");
		long K = sc.nextLong();
		sc.close();

		LinkedHashMap<Long, Boolean> position = new LinkedHashMap<>(); 
		position.put((long) 0, true);
		long current = 0;
		for(int i=0; i<=N; i++) {
			if(i==K && K>0) {
				current = K-1;
				position.put(current, true);
			}
			current = current+K;
			position.put(current, true);
		}
		System.out.print(current);
	}
}
