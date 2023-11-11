import java.util.Scanner;
public class TugasIndividu1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        System.out.print("Masukkan N = ");
        N=input.nextInt();
        for (int i = 1; i <= N; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}