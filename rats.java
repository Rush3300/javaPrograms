public class rats{
    public static void main(String args[]){
        int r=7;
        int unit=2;
        int food=r*unit;
        int[] arr = {3,5,1,6,7,8,2};
        int total = 0;
        int houses=0;
        for(int i=0;i<arr.length;i++){
            houses+=1;
            total+=arr[i];
            if(total>=food){
                break;
            }
        }
        System.out.println("food required is: "+ food);
        System.out.println("total is:"+ total);
            System.out.println("No.of houses required is:"+houses);
    }
}