import java.util.Arrays;
import java.util.Scanner;

public class Factor_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[3];
        for(int i=0;i<3;i++){
            A[i]=sc.nextInt();
        }
        int[] sortedArray = sortArrayByFactors(A);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortArrayByFactors(int[] A) {
        // Sort the array using bubble sort based on factors
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (countFactors(A[j]) > countFactors(A[j + 1])) {
                    // Swap elements
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                } else if (countFactors(A[j]) == countFactors(A[j + 1])) {
                    if (A[j] > A[j + 1]) {
                        // Swap elements if they have the same number of factors
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                }
            }
        }
        return A;
    }

    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}