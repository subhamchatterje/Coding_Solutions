import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
    
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
    
            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            ContinuousSubArrayProblem obj = new ContinuousSubArrayProblem();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
        sc.close();
    }
}
