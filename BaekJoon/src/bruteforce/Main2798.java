package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nOfCards = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] cards = new int[nOfCards];
		for (int i=0;i<nOfCards;i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for (int i=0;i<nOfCards;i++) {
			for (int j=0;j<nOfCards;j++) {
				if (j==i) {
					continue;
				}
				for (int k=0;k<nOfCards;k++) {
					if (k==i || k==j) {
						continue;
					}
					
					int tmp = cards[i]+cards[j]+cards[k];
					if (tmp > sum && tmp <= m) {
						sum = tmp;
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}
