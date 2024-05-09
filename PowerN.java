import java.util.Scanner;  
public class PowerN   
{  
      
// a method that recursively finds the power y ^ n  
public static double findPower(double y, int n)   
{  
    // the base case is handled here  
    if(n == 0)   
    {   
        return 1.0;  
    }  
      
    // recursively computing the power  
    double pwr = findPower(y, n - 1);   
  
    return y * pwr;   
}  
  
public static double powr(double Y, int N)   
{  
    // handling the negative case  
    if(N < 0)   
    {  
        return 1.0 / findPower(Y,-N);  
    }  
      
    return findPower(Y, N);  
}  
      
// main method  
public static void main(String argvs[])   
{  
// the code for getting the input   
// from user  
Scanner scnr = new Scanner(System.in);  
double y = scnr.nextDouble();  
int N = scnr.nextInt();  
  
System.out.println("The value of " + y + " ^ " + N + " is: " + powr(y, N));  
}  
}  