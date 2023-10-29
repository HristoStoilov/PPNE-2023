package JavaEasyExams.ex_1md;
import java.util.Scanner;

public class task2 {
    static int[] reversed_array(){
        Scanner scn = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = scn.nextInt();
        }
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
    public static void main(String[] args){
        int[] array = reversed_array();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
