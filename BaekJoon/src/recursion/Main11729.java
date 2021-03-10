package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11729 {
	private static StringBuilder sb;
	private static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int num = Integer.parseInt(br.readLine());
    	
		sb = new StringBuilder();

		hanoi(num, 1, 3, 2);
		
		System.out.println(count);
		System.out.println(sb);
	}
	
	public static void hanoi(int num, int start, int to, int via) {
		if (num==1) {
			sb.append(start).append(" ").append(to).append("\n");
			count++;
		} else {
			hanoi(num-1, start, via, to);
			sb.append(start).append(" ").append(to).append("\n");
			count++;
			hanoi(num-1, via, to, start);
		}
		
	}

}
