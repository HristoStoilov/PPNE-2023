package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] array = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                array[i][j] = scn.nextInt();
            }
        }
        int sum = array[0][0] + array[0][1];
        System.out.println(sum);
    }
}
