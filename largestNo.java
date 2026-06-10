public class largestNo {

    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 20, 30};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
    
}
