//replace character
import java.util.*;
public class A11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String newstr="";
        char one= sc.next().charAt(0); //******************************************************************************* */
        char two= sc.next().charAt(0); 
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==one){
                newstr= str.replace(one,two);
            }
        }
        System.out.println(".()"+ newstr);
    }
}