import java.util.ArrayList;
import java.util.Scanner;

public class pre2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int toples = in.nextInt();
        int n = in.nextInt();
        toples(toples, n);
      in.close();
      }
      private static void toples(int toples, int n) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> permen = new ArrayList<Integer>();
        for (int i = 0; i < toples; i++) {
          permen.add(in.nextInt());
        }
        for (int i = 0; i < toples; i++) {
          for (int j = i + 1; j < toples; j++) {
            if (permen.get(i) + permen.get(j) == n) {
              System.out.println((i + 1) + " " + (j + 1));
            }
          }
        }
      in.close();
      }
}
