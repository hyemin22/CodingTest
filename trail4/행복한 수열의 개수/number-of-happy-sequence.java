import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();


        // 격자에서 행복한 수열의 개수? -> 동일한 원소가 연속하여 m개 이상 나오는 구간이 존재하는 수열

        int num = 0;

        for(int i = 0; i < n; i++) {
            // 행 기준 탐색
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(j > 0 && grid[i][j] == grid[i][j-1]) count++;
                else count = 1;

                if (count >= m) {
                    num++;
                    break;
                }
            }

            // 열 기준 탐색
            count = 0;

            for(int j = 0; j < n; j++) {
                if(j > 0 && grid[j][i] == grid[j-1][i]) count++;
                else count = 1;

                if(count >= m) {
                    num++;
                    break;
                }
            }
        }

        System.out.println(num);

    }
}