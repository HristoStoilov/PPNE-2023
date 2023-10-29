package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number >= 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
