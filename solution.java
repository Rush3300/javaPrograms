//duplicate remover
class solution {
    public static void main(String args[]){
      int[] arr= {6,7,4,2,5};
      boolean[] visited = new boolean[arr.length];
      for(int i= 0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
      }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
    }
}