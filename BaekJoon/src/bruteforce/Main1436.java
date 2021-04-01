package bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1436 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nth = Integer.parseInt(br.readLine());
		
		int count=1;
		int number=666;
		
		while (nth>count) {
			number++;
			if (String.valueOf(number).contains("666")) {
				count++;
			}
		}
		
		System.out.println(number);
	}

}
