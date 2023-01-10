import java.util.Scanner;

public class pre3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        hasil(n);
        in.close();
      }
      private static void hasil(int n) {
        Scanner in = new Scanner(System.in);
        int[] Array = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
          Array[i] = in.nextInt();
          int angka = Array[i];
          int q, w = 0;
          do {
            q = angka % 10;
            w = w * 10 + q;
            angka = angka / 10;
          } while (angka > 0);
          Array[i] = w;
        }
        for (int i = 0; i < n * 2; i += 2) {
          System.out.print(Array[i] + Array[i + 1] + " ");
        }
        in.close();
      }
}
