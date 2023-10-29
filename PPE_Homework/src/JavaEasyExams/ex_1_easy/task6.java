package JavaEasyExams.ex_1_easy;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int leftToRight = 0;
        int rightToLeft = 0;
        int[][] array = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                array[i][j] = scn.nextInt();
            }
        }
        leftToRight = array[0][0] + array[1][1];
        rightToLeft = array[0][1] + array[1][0];
        System.out.println(leftToRight);
        System.out.println(rightToLeft);
    }
}
