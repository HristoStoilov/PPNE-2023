package JavaEasyExams.ex_1md;
import java.util.Scanner;
public class task4 {
    static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i < number - 1; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(isPrime(number));
    }
}
