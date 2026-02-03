public class MultiTable6to9 {
    public static void main(String[] args) {
        int[][] table = new int[4][10]; 

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                table[num - 6][i - 1] = num * i;
                System.out.println(num + " * " + i + " = " + table[num - 6][i - 1]);
            }
            System.out.println();
        }
    }
}
