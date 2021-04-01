package bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 {
	public static char[][] input;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		input = new char[n][m];
		String line = null;
		for (int i=0;i<n;i++) {
			line = br.readLine();
			for (int j=0;j<m;j++) {
				input[i][j]=line.charAt(j);
			}
		}
		
		int min = Integer.MAX_VALUE;
		int tmp = 0;
		for (int i=0;i<=n-8;i++) {
			for (int j=0;j<=m-8;j++) {
				tmp = repaint(i,j);
				if (Math.min(tmp, 64-tmp)<min) {
					min=Math.min(tmp, 64-tmp);
				}
			}
		}
		
		System.out.println(min);
	}
	
	public static int repaint(int i, int j) {
		int count = 0;
		char color = input[i][j];
		for (int x=i;x<i+8;x++) {
			for (int y=j;y<j+8;y++) {				
				if (color!=input[x][y]) {
					count++;
				}
				color = (color=='W')?'B':'W';
			}
			color = (color=='W')?'B':'W';
		}
		return count;
	}

}
