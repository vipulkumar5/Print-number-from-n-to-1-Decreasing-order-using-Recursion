import java.util.*;
public class Main{
    public static void main(String[]args){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintNum(n);
    }
    public static void PrintNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
        
    }
    
}