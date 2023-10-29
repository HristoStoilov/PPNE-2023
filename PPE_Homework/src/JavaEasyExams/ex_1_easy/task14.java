package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task14 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
