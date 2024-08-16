// nt NumberOfCarries(int num1 , int num2);

// The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

// Assumption: num1, num2>=0

// Example:

// Input
// Num 1: 451
// Num 2: 349
// Output
// 2
// Explanation:

// Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.
public class A10{

    public static int countCarries(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            System.out.println("after mod"+digit1);
            int digit2 = num2 % 10;
            System.out.println("after mod"+digit2);

            if (digit1 + digit2 + carry >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            num1 /= 10;
            System.out.println("after division"+num1);
            num2 /= 10;
            System.out.println("after division"+num2);
        }

        return count;
    }

    public static void main(String[] args) {
        int num1 = 123;
        System.out.println("initial num1 "+num1);
        int num2 = 594;
        System.out.println("initial num2 "+num2);
        
        int result = countCarries(num1, num2);
        System.out.println("Total number of carries: " + result); // Output should be 1
    }
}