import java.util.Scanner;
public class Multiple{
    public void multi(){
        //Multipication ocde------------------------------------------------------
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter quantity of numbers");
        int qn= sc.nextInt();
        double sum=1;
        
        for(int i=1; i<=qn; i++){
            System.out.println("Please enter your number");
            double num = sc.nextDouble();
            sum= sum*num;
        }
        System.out.printf("Result = %.2f\n", sum);
    }
}