import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr = new int[30];
        int i;

        for(i=0; i<28; i++) {
            int n = num.nextInt();
            arr[n-1] = n;
        }
        for(i=0; i<30; i++) {
            if(arr[i]==0)
                System.out.println(i+1);
        }
    }
}