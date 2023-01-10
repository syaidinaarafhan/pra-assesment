import java.util.Scanner;

public class pra1 {
    public static void main(String[] args) {
        //soal no 1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        bintang(n);
        in.close();
      }
    
      private static void bintang(int n) {
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
          }
          for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
      }
}
