import java.util.Scanner;
public class lc50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = powerNumber(x,n);
        System.out.println(result);
    }
    public static double powerNumber(double x,int n) {
        if (x == 0 || x == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        if (n > 0) {
            return n % 2 == 0 ? powerNumber(x, n / 2) * powerNumber(x, n / 2) : powerNumber(x, n / 2) * x;
        }
        else{
            return n % 2 == 0 ? powerNumber(1/x, -n / 2) * powerNumber(1/x, -n / 2) : powerNumber(1/x, -n / 2) * 1/x;
        }
    }
}
