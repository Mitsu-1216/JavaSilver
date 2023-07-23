package introduction1.in2_10;

public class main {
    public static void main(String[] args) {
String str = "hoge,world";
hello(str);
System.out.println(str);
    }
    private static void hello(String msg){
        msg.replaceAll("hoge","hello");
    }
}
