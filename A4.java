// differenceofSum(n. m)
// Example

// Input
// n:4
// m:20
// Output
// 90

// Explanation

// Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
// Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
// Difference 150 – 60 = 90
// Sample Input
// n:3
// m:10
// Sample Output
// 19
public class A4{
    public static int difference(int n,int m){
        int dbn=0,ndbn=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                dbn+=i;
            }else{
                ndbn+=i;
            }
        }
        return ndbn-dbn;
    }
    public static void main(String args[]){
        int n=4;
        int m= 20;
        int result = difference(n,m);
        System.out.println("difference is: "+result);
    }
}