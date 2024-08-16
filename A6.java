//conductor ulta ticket
import java.util.*;
public class A6{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int ticket = sc.nextInt();
        String ticketstr = String.valueOf(ticket);
        String[] tik = ticketstr.split("");

        for(int i=tik.length-1;i>=0;i--){
            if(!tik[i].equals("0")){
                System.out.print(tik[i]);
            }
        }
        
    }
}