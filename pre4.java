import java.util.ArrayList;
import java.util.Scanner;

public class pre4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        hasil(n);
        in.close();
      }
      private static void hasil(int n) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> kata = new ArrayList<String>();
    
        for (int i = 0; i < n; i++) {
          kata.add(in.nextLine());
        }
        for (int i = 0; i < kata.size() - 1; i += 2) {
          String per = kata.get(i);
          kata.set(i, kata.get(i + 1));
          kata.set(i + 1, per);
        }
        for (int i = 0; i < n; i++) {
          System.out.println(kata.get(i));
        }
        in.close();
      }
}
