package introduction4.in4_9;

public class main {
    public static void main(String[] args) {
        int total = 0;
        int array[][] = new int[][] { { 1, 2 }, { 2, 3, 4 } };
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        System.out.print(total);
    }
}
