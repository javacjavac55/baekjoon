package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2447 {
	static char[][] result;
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int num = Integer.parseInt(br.readLine());
    	
    	result = new char[num][num];

    	star(0,0,num, false);
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i=0;i<num;i++) {
    		for (int j=0;j<num;j++) {
    			sb.append(result[i][j]);
    		}
    		sb.append("\n");
    	}
    	System.out.print(sb);
    }
	
	public static void star(int x, int y, int num, boolean blank) {
		if (blank) {
			for (int i=x;i<x+num;i++) {
				for (int j=y;j<y+num;j++) {
					result[i][j]=' ';
				}
			}
			return;
		}
		
		if (num==1) {
			result[x][y]='*';
			return;
		}
		
		int move = num/3;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (i==1 && j==1) {
					star(x+(move*i), y+(move*j), move, true);
				} else {
					star(x+(move*i), y+(move*j), move, false);
				}
				
			}
		}
	}
}
