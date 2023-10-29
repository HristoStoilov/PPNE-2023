package JavaEasyExams.ex_1_easy;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();
        if(first == second){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
