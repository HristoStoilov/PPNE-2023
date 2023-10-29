package JavaEasyExams.ex_1_easy;
import java.util.Scanner;
public class task11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number > 10){
            System.out.println("Bigger");
        }
        else if(number == 10){
            System.out.println("It's 10");
        }
        else{
            System.out.println("Smaller");
        }
    }
}