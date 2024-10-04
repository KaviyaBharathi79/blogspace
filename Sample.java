import java.util.*;
public class Sample {
    public static int minApple(int M, int K, int S, int N, int E, int W) {
        int southApple = S * K;
        int totalOtherApple = K * (N+W+E);
        
        if(M<=southApple) {
            return M;
        }
        else if (M<=southApple+totalOtherApple) {
            return southApple + (M-southApple);
        }
        else {
            return -1;
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter M");
        int M = sc.nextInt();
        System.out.println("enter K");
        int K = sc.nextInt();
        System.out.println("enter S");
        int S = sc.nextInt();
        System.out.println("enter N");
        int N = sc.nextInt();
        System.out.println("enter E");
        int E = sc.nextInt();
        System.out.println("enter W");
        int W = sc.nextInt();

        int ans = minApple(M,K,S,N,E,W);
        System.out.println(ans);
    }
}