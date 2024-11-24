import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle (n): ");
        int n = input.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0; j< n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0 ;k < 2*i + 1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}