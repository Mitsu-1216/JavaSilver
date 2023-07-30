package introduction1.in3_8;

public class main {
    public static void main(String[] args) {
        Sample s1 = new Sample(10);
        Sample s2 = s1;

        // ↓この1行がなければtrue
        s1 = new Sample(10);
        System.out.println(s1 == s2);
    }
}
