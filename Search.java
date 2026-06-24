
import java.util.Scanner;

class Search {

    public int search(int arr[], int x) {
        // code here

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        Search obj = new Search();
        System.out.println(obj.search(arr, x));
    }

}
