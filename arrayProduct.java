
public class arrayProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int n = arr.length;
        int[] ans = new int [arr.length];
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] * arr[i-1];
        }
        System.out.println("Prefix product array: " + java.util.Arrays.toString(prefix));
        
        int[] suffix = new int[n];
        suffix[n-1] = 1;
        for (int i=n-2; i>=0; i--) {
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        System.out.println("Suffix product array: " + java.util.Arrays.toString(suffix));

        for (int i=0; i<n; i++) {
            ans[i] = prefix[i] * suffix[i];
        
        }
        System.out.println("Product of array except self: " + java.util.Arrays.toString(ans));
    }

}
