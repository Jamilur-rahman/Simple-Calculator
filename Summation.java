import java.util.Scanner;
public class Summation{
    public void Summ(){
        //Summation code --------------------------------------------------
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter quantity of numbers");
        int qn= sc.nextInt();
        int sum=0, i;
        
        for(i=1; i<=qn; i++){
            System.out.println("Please enter your number");
            int num = sc.nextInt();
            sum= sum+ num;
        }
        System.out.println("Result = " + sum);
    }
}
