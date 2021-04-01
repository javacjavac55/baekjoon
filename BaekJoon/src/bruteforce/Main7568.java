package bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7568 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nOfPeople = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = null;
		Person[] people = new Person[nOfPeople];
		for (int i=0;i<nOfPeople;i++) {
			st = new StringTokenizer(br.readLine());
			people[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<nOfPeople;i++) {
			count = 1;
			for (int j=0;j<nOfPeople;j++) {
				if (i==j) {
					continue;
				}
				if (people[i].compareTo(people[j])==-1) {
					count++;
				}
			}
			sb.append(count).append(" ");
		}
		
		System.out.println(sb);
	}

}

class Person implements Comparable<Person> {
	private int height;
	private int weight;
	
	Person(int height, int weight) {
		this.height=height;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Person o) {
	      if (this.height > o.height && this.weight > o.weight) {
	    	  return 1;
	      } else if (this.height < o.height && this.weight < o.weight) {
	    	  return -1;
	      } else {
	    	  return 0;
	      }
	}  
}
