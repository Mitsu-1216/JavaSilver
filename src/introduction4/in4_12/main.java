package introduction4.in4_12;

public class main {
    public static void main(String[] args) {
        
        String[] array={"A","B","C"};

        for (String str:array) {
            str="D";
        }5

        for (String str:array) {
            System.out.print(str);
        }
    }
}
