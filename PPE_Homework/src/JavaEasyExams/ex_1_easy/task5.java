package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int array[] = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = scn.nextInt();
        }
        int max = array[0];
        for(int i = 1; i < 5; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
