
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 0;test_case<10;test_case++) {
			int num = sc.nextInt();
			char arr[][] = new char[100][100];
			
			//배열에 원소 삽입
			for(int i=0;i<100;i++) {
				String s = sc.next();
				char input[] = s.toCharArray();
				for(int j=0;j<100;j++) {
					arr[i][j] = input[j];
				}
			}
			
			//회문 최대 길이 변수
			int max = 0;
			
			//가로 회문 찾기
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					//길이 1~100까지 다 검사
					for(int k=0;k<100;k++) {
						char pal[] = new char[k+1];
						
						for(int l=0;l<=k;l++) {
							if(j+k > 99){
								break;
							}
							pal[l] = arr[i][j+k];
						}
						
						char test[] = new char[pal.length];
						//순서 반대인 배열 만들기
						for(int l=0;l<pal.length;l++) {
							test[l] = pal[pal.length-1-l];
						}
						
						boolean isPal = true;
						
						//기존 배열과 반대인 배열의 일치 여부 확인
						for(int l=0;l<pal.length;l++) {
							if(pal[l] != test[l])
								isPal = false;
						}
						
						if(isPal) {
							if(max <= pal.length)
								max = pal.length;
						}
					}
				}
			}
			
			//세로 회문 찾기
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					//길이 1~100까지 다 검사
					for(int k=0;k<100;k++) {
						char pal[] = new char[k+1];
						
						for(int l=0;l<=k;l++) {
							if(i+k > 99){
								break;
							}
							pal[l] = arr[i+k][j];
						}
						
						boolean isPal = true;
						
						char test[] = new char[pal.length];
						//순서 반대인 배열 만들기
						for(int l=0;l<pal.length;l++) {
							test[l] = pal[pal.length-1-l];
						}
						
						for(int l=0;l<pal.length;l++) {
							if(pal[l] != test[l])
								isPal = false;
						}
						
						if(isPal) {
							if(max <= pal.length)
								max = pal.length;
						}
					}
				}
			}
			
			System.out.println("#" + num + " " + max);
		}
	}
}
