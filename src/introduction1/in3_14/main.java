package introduction1.in3_14;

public class main {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String(a);

        int count = 0;
        if (a.intern() == "abc") {
            count++;
        }

        if (b.intern() == "abc") {
            count++;
        }
        if (a.intern() == b.intern()) {
            count++;
        }

        System.out.print(count);

    }
}
