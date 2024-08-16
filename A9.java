// move hypens to front of str
import java.util.*;
public class A9{
    public static void movehype(String str,String newstr){
        int count=0;
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            if(currchar=='-'){
                count++;
            }
            else{
                newstr+=currchar;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print("-");
        }
        System.out.print(newstr);     
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        movehype(str,"");
    }
}