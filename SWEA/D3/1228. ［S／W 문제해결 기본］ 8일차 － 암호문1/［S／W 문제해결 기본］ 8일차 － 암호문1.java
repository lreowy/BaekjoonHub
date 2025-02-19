import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc=1;tc<=10;tc++) {
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			LinkedList<String> linkedList = new LinkedList<>();
			for(int i=0;i<N;i++) {
				linkedList.add(st.nextToken());
			}
			
			int num = Integer.parseInt(br.readLine());
			
			String com = br.readLine();
			st = new StringTokenizer(com);
			for(int i=0;i<num;i++) {
				st.nextToken();
				int idx = Integer.parseInt(st.nextToken());
				int count = Integer.parseInt(st.nextToken());
				for(int j=0;j<count;j++) {
					linkedList.add(idx++, st.nextToken());
				}
			}
			System.out.print("#" + tc + " ");
			for(int i = 0;i<10;i++) {
				System.out.print(linkedList.get(i) + " ");
			}
		}
	}
}