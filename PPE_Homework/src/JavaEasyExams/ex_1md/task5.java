package JavaEasyExams.ex_1md;
import java.util.Scanner;
public class task5 {
    static int sumRepetition(int array[][]){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 && j == 0){
                    sum += array[i][j];
                }
                if(i == 0 && j == 2){
                    sum += array[i][j];
                }
                if(i == 1 && j == 1){
                    sum += array[i][j] * 2;
                }
                if(i == 2 && j == 2){
                    sum += array[i][j];
                }
                if(i == 2 && j == 0){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    static int sumNoRepetition(int array[][]){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 && j == 0){
                    sum += array[i][j];
                }
                if(i == 0 && j == 2){
                    sum += array[i][j];
                }
                if(i == 1 && j == 1){
                    sum += array[i][j];
                }
                if(i == 2 && j == 2){
                    sum += array[i][j];
                }
                if(i == 2 && j == 0){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] array = new int[3][3];
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = scn.nextInt();
            }
        }
        int sumRepeat = sumRepetition(array);
        int sumNoRepeat = sumNoRepetition(array);
        System.out.println("Sum with repetition: " + sumRepeat);
        System.out.println("Sum with no repetition: " + sumNoRepeat);
    }
}
