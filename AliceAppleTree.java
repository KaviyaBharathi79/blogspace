import java.util.Scanner;

public class AliceAppleTree {
    static int minApple(int M, int K, int S, int E, int N, int W) {
        int totalOtherApple =  N * K + E * K + W * K;
        int southApples = S * K;
        // If the apples required are less than or equal to apples from the South direction
        if (M <= southApples) {
            return M;
        }
        else if (M <= southApples + totalOtherApple) {
            return southApples + (M - southApples);
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of apples to be collected: ");
        int M = sc.nextInt();
        System.out.println("Enter the number of apples in each tree: ");
        int K = sc.nextInt();
        System.out.println("Enter the number of trees in North: ");
        int N = sc.nextInt();
        System.out.println("Enter the number of trees in South: ");
        int S = sc.nextInt();
        System.out.println("Enter the number of trees in East: ");
        int E = sc.nextInt();
        System.out.println("Enter the number of trees in West: ");
        int W = sc.nextInt();

        int ans = minApple(M, K, S, E, N, W);
        System.out.println(ans);
    }
}
