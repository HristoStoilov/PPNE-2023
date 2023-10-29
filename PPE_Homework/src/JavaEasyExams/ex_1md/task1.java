package JavaEasyExams.ex_1md;
import java.util.Scanner;

public class task1 {
    static int sumOfArray(int array[]){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += array[i];
        }
        return sum;
    }
    static int sumOfEven(int array[]){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
    static int sumOfOdd(int array[]){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            if(array[i] % 2 != 0){
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = scn.nextInt();
        }
        int sum = sumOfArray(array);
        int sumEven = sumOfEven(array);
        int sumOdd = sumOfOdd(array);
        System.out.println(sum);
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
