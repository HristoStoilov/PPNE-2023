package JavaEasyExams.ex_1_easy;
import java.util.Scanner;

public class task15 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int k = 1;
        for(int i = 0; i < number; i++){
            for(int j = 0; j < k; j++){
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
    }
}
