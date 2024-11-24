import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static double avg (int[] arr){
        int length = arr.length;
        int sum = 0;
        for(int i = 0;i<length;i++){
            sum += arr[i];
        }
        return (double)sum / length;
    }
    public static double sum(int[] arr){
        int length = arr.length;
        double sum = 0;
        for(int i=0;i<length;i++){
            sum+=(double)arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0;i <n;i++){
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        double temp = avg(array);
        double sum = sum(array);

        System.out.printf("Sorted Array: " + Arrays.toString(array));
        System.out.printf("\nSum of Array: %.2f",sum);
        System.out.printf("\nAvarage of Array: %.2f",temp);
    }
}
