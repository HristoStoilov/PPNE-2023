package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = scn.nextInt();
        }
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
