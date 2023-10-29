package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < number / 2; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
