import java.util.Scanner;
public class Average{
    public void avg(){
        //Average code---------------------------------------------
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter quantity");
        int qn=sc.nextInt(), i;
        double sum =0;
        
        for(i=1; i<=qn; i++){
            System.out.println("Please enter a number");
            int num= sc.nextInt();
            sum= sum+num;
        }
        double avg = sum/qn;
        System.out.printf("Result = %.2f\n",avg);
    }
}