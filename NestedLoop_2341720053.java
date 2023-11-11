import java.util.Scanner;
public class NestedLoop_2341720053{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double [][] suhu = new double[5][7];
        double [] totalSuhu = new double[7];
        int [] mean = new int[5];
        for(int i=0;i<suhu.length;i++){
            System.out.println("Kota ke-" +(i+1));
            for(int j=0;j<suhu[0].length;j++){
                System.out.print("Hari ke-"+(j+1)+ " : ");
                suhu[i][j]=input.nextDouble();
                totalSuhu[i]+=suhu[i][j];
            }
            System.out.println();
        }
        for (double[] kota : suhu) {
            int i = 1;
            System.out.print("Kota ke-"+i+" : ");
            for (double hari : kota) {
                System.out.print(hari + " ");
            }
            System.out.println();
            i++;
        }
        for(int i=0;i<suhu.length;i++){
            System.out.println("Rata-rata suhu Kota ke " +(i+1) + " = " + totalSuhu[i]/7);
        }
    }
}