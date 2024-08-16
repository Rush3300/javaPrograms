// Int OperationChoices(int c, int n, int a , int b )

// The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.

// ( a+ b ) , if c=1
// ( a – b ) , if c=2
// ( a * b ) ,  if c=3
// (a / b) ,  if c =4
import java.util.*;
public class A12{
    public static int OperationChoices(int a, int b , int c){
        switch(c){
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;   
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result= OperationChoices(a,b,c);
        System.out.println(c +":" + result);
    }
}