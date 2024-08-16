
// n: 12
// num: 718

// Output
// 4BA

// Explanation
// num       Divisor       quotient       remainder
// 718           12               59                 10(A)
// 59             12                4                   11(B)
// 4               12                0                   4(4)

// (0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)
public class A8 {
    public static int finalfun(char[] sys,int num,int div){
        if(num/div==0){
            System.out.println("num Divisor quotient remainder");
            System.out.println(num+" "+div+" "+num/div+" "+num%div + "(" + sys[num % div] + ")");
            System.out.print(sys[num%div]);
            return 1;
        }
        System.out.println("num Divisor quotient remainder");
        System.out.println(num+" "+div+" "+num/div+" "+num%div + "(" + sys[num % div] + ")");
        finalfun(sys,num/div,div);
        System.out.print(sys[num%div]);
        return 0;
    }

    public static void main(String[] args) {
        int div = 12;
    int num = 718;
         char[] sys = new char[36];

        for (int i = 0; i < 10; i++) {
            sys[i] = (char) ('0' + i);
        }

        for (int i = 10; i < 36; i++) {
            sys[i] = (char) ('A' + (i - 10)); // Start from 'A' and increment by index - 10
        }
        finalfun(sys,num,div);
    }
}
