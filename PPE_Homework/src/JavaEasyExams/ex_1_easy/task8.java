package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] array = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                array[i][j] = scn.nextInt();
            }
        }
        int sum = array[1][0] + array[1][1];
        System.out.println(sum);
    }
}