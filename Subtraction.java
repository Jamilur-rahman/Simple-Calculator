import java.util.Scanner;
public class Subtraction{
    public void sub(){
        //Subtraction class-------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=sc.nextInt();
        System.out.println("Please enter a number");
        int b=sc.nextInt();
        int sum;
        if(a>b){
            sum=a-b;
        }
        else{
            sum= b-a;
        }
        System.out.println("Result = " +sum);
    }
}