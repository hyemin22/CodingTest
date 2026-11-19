import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt(); //블록
        }
        int s1 = sc.nextInt(); // 제거할 블록 시작
        int e1 = sc.nextInt(); // 제거할 블록 끝
        int s2 = sc.nextInt(); 
        int e2 = sc.nextInt();

        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(i >= s1-1 && i <= e1-1) continue;
            temp.add(blocks[i]);
        }

        ArrayList<Integer> temp2 = new ArrayList<>();
        
        for(int i = 0; i < temp.size(); i++) {
            if(i >= s2-1 && i <= e2-1) continue;
            temp2.add(temp.get(i));
        }

        System.out.println(temp2.size());
        for(int i = 0; i < temp2.size(); i++) {
            System.out.println(temp2.get(i));
        }
        
    }
}