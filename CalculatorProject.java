import java.util.Scanner;
public class CalculatorProject{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //Call methods----------------------------------
        Summation summation= new Summation();
        Subtraction subtraction = new Subtraction();
        Multiple multiple = new Multiple();
        Division division = new Division();
        Average average = new Average();
        AddEven addEven = new AddEven();
        OddAdd addOdd = new OddAdd();
        Algebra algebra = new Algebra();
        
        //Calculation Codes
        //----------------------------------------------
        System.out.println("SUMMATION CODE = 1   "+ "SBTRACTION CODE = 2   "+
                         "MULTIPLICATION CODE = 3\n" +"DIVISION CODE = 4   " + "AVERAGE CODE = 5   "+
                         "ONLY ADD EVEN CODE = 7 \n" + "ONLY ADD ODD CODE= 8   " +
                         "SQURE CODE = 10   " + "SQURE ROOT CODE = 11\n" +"CUBE CODE = 12   " +
                         "CUBE ROOT = 13   ");
        System.out.println();
        System.out.println("Please enter relevent code");
        
        int code= sc.nextInt();
        
        //summation--------------------------------------------------
        if(code==1){
            summation.Summ();
        }
        //subtraction code--------------------------------------------
        else if(code==2){
            subtraction.sub();
        }
        //multiplication code-----------------------------------------
        else if(code==3){
            multiple.multi();
        }
        //division code-----------------------------------------------
        else if(code==4){
            division.divi();
        }
        //average code------------------------------------------------
        else if(code==5){
            average.avg();
        }
        //Even add code-----------------------------------------------
        else if(code==7){
            addEven.aEven();
        }
        //Odd add code------------------------------------------------
        else if(code==8){
            addOdd.aOdd();
        }
        //Squre code--------------------------------------------------
        else if(code==10){
            System.out.println("Please enter a number");
            double x=sc.nextDouble();
            algebra.squre(x);
        }
        //Squre root code----------------------------------------------
        else if(code==11){
            System.out.println("Please enter a number");
            double x=sc.nextDouble();
            algebra.sqrt(x);
        }
        //Cube code----------------------------------------------------
        else if(code==12){
            System.out.println("Please enter a number");
            double x=sc.nextDouble();
            algebra.cube(x);
        }
        //Cube root code-----------------------------------------------
        else if(code==13){
            System.out.println("Please enter a number");
            double x=sc.nextDouble();
            algebra.cubert(x);
        }
        
    }
}
