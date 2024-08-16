// int findCount(int arr[], int length, int num, int diff);

// The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
// Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

// Example:
// Input:

// arr: 12 3 14 56 77 13
// num: 13
// diff: 2
// Output:
// 3

public class A3{
    public static int findCount(int arr[], int length, int num, int diff){
        int count=0;
        for(int i =0;i<length;i++){
            if(Math.abs(num-arr[i])<=diff){
                count++;
                System.out.println("element whose abs difference with num is less than diff is: "+arr[i]);
            }else{
                continue;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] arr= {12,4,13,10,11,2};
        int length = arr.length;
        int diff = 2;
        int num = 13;
        int result= findCount(arr, length, num, diff);
        System.out.println("final no.of elements whose absolute difference with num is less than diff are: "+result);
    }
}