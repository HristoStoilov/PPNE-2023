package JavaEasyExams.ex_1_easy;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] array = new int[3];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            array[i] = scn.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
