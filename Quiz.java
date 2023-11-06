import java.util.Scanner;
import java.util.Random;
public class Quiz{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String menu = "y";
        do{
            int number = random.nextInt(10) +1;
            boolean success = false;
            do{
                System.out.println("Tebak Angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                success=(answer == number);
                if(answer<number){
                    System.out.println("Nilai tebakan lebih kecil");
                }
                else if (answer>number){
                    System.out.println("Nilai tebakan lebih besar");
                }else{
                    System.out.println("Tebakan Benar");
                }
            }while(!success);
                System.out.print("Apakah anda ingin melanjutkan permainan?? (Y/N) : ");
                menu = input.nextLine();   
                if(menu.equalsIgnoreCase("N")){
                    break;
                }
        }while(menu.equalsIgnoreCase("Y"));
    }
}