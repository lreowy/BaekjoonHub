import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] frequency = new int[8001];
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i =0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            frequency[arr[i] + 4000]++;

            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }



        int maxCount = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<8001;i++) {
            if(frequency[i] > maxCount) {
                maxCount = frequency[i];
            }
        }

        for (int i = 0; i < 8001; i++) {
            if(frequency[i] == maxCount) {
                list.add(i-4000);
            }
        }
        Arrays.sort(arr);
        Collections.sort(list);

        System.out.println(Math.round((double)sum/N));
        System.out.println(arr[N/2]);
        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(1));
        }
        System.out.println(max-min);
    }
}
