import java.util.Scanner;

public class Star{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Masukkan Nilai N = ");
        N= input.nextInt();
        for(int i=1;i<=N;i--){
            System.out.print("*");
        }
        

    }
}