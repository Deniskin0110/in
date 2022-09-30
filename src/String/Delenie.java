package String;

public class Delenie {
    Split i = new Split();

    public  static String delenie(String a, String b) {
        int mmm = a.length();
        int c = mmm / Integer.parseInt(b.trim());
        System.out.println(mmm);
        System.out.println(c);
        return a.substring(0, c);
    }
}
