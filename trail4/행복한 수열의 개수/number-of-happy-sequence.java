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
            int now = grid[i][0];
            int count = 1;

            for(int j = 1; j < n; j++) {
                if(now == grid[i][j]) count++;
                else {
                    if(count >= m) {
                        num++;
                        count = 0;
                        break;
                    }
                    count = 1;
                    now = grid[i][j];
                }
            }

            if(count >= m) num++;

            // 열 기준 탐색
            now = grid[0][i];
            count = 1;

            for(int j = 1; j < n; j++) {
                if(now == grid[j][i]) count++;
                else {
                    if(count >= m) {
                        num++;
                        count = 0;
                        break;
                    }
                    count = 1;
                    now = grid[j][i];
                }
            }

            if(count >= m) num++;

        }

        System.out.println(num);

    }
}