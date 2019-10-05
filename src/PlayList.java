import java.util.Scanner;

public class PlayList {

	private static int findNoOfSteps(final String[] songs,final int k, final String q) {
		if(songs == null || songs.length == 0 || q == null || q.isEmpty()) {
			return k;
		}
		
		class list{
			list prev;
			String song;
			list next;
			
			list(String song){
				this.song = song;
			}
		}
		list head = null;
		list tail = null;
		
		for(String song : songs) {
			list element = new list(song);
			if(head == null && tail == null) {
				head = element;
				tail = element;
			} else {
				tail.next = element;
				tail = element;
				tail.next = head;
			}
		}
		list current = head;
		int forward = 0;
		do {
			if(head == null || current ==null ||q.equalsIgnoreCase(current.song)) {
				break;
			}
			current = current.next;
			forward++;
		}while (current != head);
		
		current = tail;
		int backward = 0;
		do {
			if(tail == null || current == null || q.equalsIgnoreCase(current.song)) {
				break;
			}
			current = current.prev;
			backward++;
		}while (current != tail);
		
		return (forward <= backward? forward:backward);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of songs");
		int n = sc.nextInt();
		String [] songs = new String[n];
		System.out.println("Enter names of songs");
		for(int i=0; i<n; i++) {
			System.out.print(i+"\t");
			songs[i] = sc.next();
		}
		System.out.println("Enter index of current song");
		int k = sc.nextInt();
		System.out.println("Enter name of song you want to play next");
		String q = sc.next();
		sc.close();
		System.out.println("Steps "+ findNoOfSteps(songs, k, q));
	}

}
