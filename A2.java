public class A2{
    public static void main(String args[]){
        int n= 25;
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        int mask = (1 << bin.length())-1;   //shift 1 by length of bin to create  a mask.
        int toggled = n ^ mask;              // this is xor operation ie. negation of anything 1 to 0 and 0 to 1.
        String togg= Integer.toBinaryString(toggled);
        while (togg.length() < bin.length()) {
            togg = "0" + togg;
        }
        System.out.println(togg);
        }
    }