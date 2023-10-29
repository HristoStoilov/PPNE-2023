package JavaEasyExams.ex_1md;
import java.util.Scanner;

public class task3 {
    static void minMax(int[] array){
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int sizeArray = scn.nextInt();
        int[] array = new int[sizeArray];
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        minMax(array);
    }
}
