import java.util.ArrayList;
import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main(n);
        in.close();
      }
      private static void main(int n) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> isi = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
          isi.add(in.next());
        }
        String yangAda = in.next();
        if (isi.contains(yangAda)) {
          System.out.print("Kata " + yangAda + " ada dalam list");
        } else {
          System.out.print("Kata " + yangAda + " tidak ada dalam list");
        }
        in.close(); 
    }
    
}
