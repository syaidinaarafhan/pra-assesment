import java.util.ArrayList;
import java.util.Scanner;

public class pra3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        main(kalimat);
        in.close();
      }
      private static void main(String kalimat) {
        String[] array = kalimat.split(" ");
        char vokal = vokal();
        char kosa = kosaKata();
        ArrayList<String> kataBaru = new ArrayList<>();
        for (String s : array) {
          String kataBaru2 = s + vokal + kosa;
          kataBaru.add(kataBaru2);
        }
        String kalimat2 = String.join(" ", kataBaru);
        System.out.println(kalimat2.toUpperCase());
      }
      private static char vokal() {
        char[] vokal = {'a','e','i','o','u'};
        int in = (int) (Math.random() * vokal.length);
        return vokal[in];
      }
      private static char kosaKata() {
        char[] kosa = {
          'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z',
        };
        int in = (int) (Math.random() * kosa.length);
        return kosa[in];
      }
}
