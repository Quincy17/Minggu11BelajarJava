import java.util.Scanner;
public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Masukkan Nilai N = ");
        N=input.nextInt();

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
