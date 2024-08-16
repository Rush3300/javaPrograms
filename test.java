// to find freq of nos in array
public class test {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int n = array.length;
        boolean[] counted = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (counted[i]) {
                continue;
            }
        int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    counted[j] = true; 
                }
            }
            System.out.println("Element " + array[i] + " occurs " + count + " times.");
        }
    }
}