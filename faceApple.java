import java.util.*;
public class faceApple {
    public static void main (String [] args) {
        int cnt =0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of apples");
        int apples = sc.nextInt();
        while(sum<apples) {
            cnt++;
            sum = 12 * cnt * cnt;
        }
        System.out.println(8*cnt);
    }
}

