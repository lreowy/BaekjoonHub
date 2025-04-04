import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int N, M;
    static int[] store;
    static int[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[10001];
        store = new int[M];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        recur(0);
    }

    static void recur(int idx){
        if(idx == M){
            boolean flag = true;
            for(int i=0;i< store.length-1;i++){
                if(store[i] > store[i+1]){
                    flag = false;
                }
            }
            if(flag){
                for(int i=0;i<store.length;i++){
                    System.out.print(store[i] + " ");
                }
                System.out.println();
            } else {
                return;
            }
            return;
        }

        for(int i=0;i<N;i++){
            if(visited[arr[i]]){
                continue;
            }
            visited[arr[i]] = true;
            store[idx] = arr[i];
            recur(idx+1);
            visited[arr[i]] = false;
        }

    }

}
